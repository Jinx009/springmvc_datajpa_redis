var CONTEXT_PATH = "${contextPath}";
var platformName = "${sessionScope.PAY_CASHIER.platformName}";
var aes_randomKey = "${sessionScope.aes_randomKey}";
var publicKey = "${sessionScope.rsa_pubKey}";
var c_beforeMerchantUrl = "${sessionScope.PAY_CASHIER.order.beforeMerchantUrl}";
var RSAUtils = new JSEncrypt();
RSAUtils.setPublicKey(publicKey);
$(function(){
    console.log('generateMixed:------'+generateMixed());
})
function generateMixed() {
    var jschars = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"];
    var res = "";
    for (var i = 0; i < 32; i++) {
        var id = Math.ceil(Math.random() * 35);
        res += jschars[id]
    }
    return res
}
function AES_Encode(plain_text, key) {
    GibberishAES.size(256);
    return GibberishAES.aesEncrypt(plain_text, key)
}
function h5CommonRsa(str) {
    var num = generateMixed();
    var AESKey = RSAUtils.encrypt(num);
    $("#h_AESKey").val(AESKey);
    $("#h_AESStr").val(AES_Encode(str, num))
}
function loadUrl(url) {
    showDialogByDiv("waitingAreaId");
    window.location.href = url
}
var webMessagePage = "";
function load(objId) {
    var oInp = document.getElementById(objId);
    oInp.addEventListener("touchstart", touch, false);
    oInp.addEventListener("touchend", touch, false);
    function touch(event) {
        var event = event || window.event;
        switch (event.type) {
        case "touchstart":
            oInp.style.background = "#FE007F";
            oInp.style.color = "#f4f4f4";
            break;
        case "touchend":
            oInp.style.background = "";
            oInp.style.color = "#FE007F";
            break
        }
    }
}
function sessionOut(resp) {
    if (resp.errorCode == "COOKIE_SESSION_EXPIRED") {
        window.location.href = CONTEXT_PATH + "/gateway.pay?sessionTimeout=true";
        return "return"
    }
    return "continue"
}