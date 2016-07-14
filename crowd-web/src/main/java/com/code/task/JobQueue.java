package com.code.task;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


import com.code.task.queue.NoticeTaskLog;

public class JobQueue<T>{

	private Queue<T> queue = new ConcurrentLinkedQueue<T>();
	private Lock LOCK = new ReentrantLock();
	private LoanTask task;
	
	private static class LazyHolder{
	//	private static final JobQueue<NoticeLog> NOTICE_INSTANCE = new JobQueue<NoticeLog>(new NoticeTaskLog());
	}
	
	/**
	 * 短信发送队列
	 * @return
	 */
//	public static JobQueue<NoticeLog> getNoticeInstance(){
//		return LazyHolder.NOTICE_INSTANCE;
//	}
//
	private JobQueue(LoanTask task){
		super();
		this.task = task;
	}

	/**
	 * add(e) offer(e) put(e) 入列
	 * @param model
	 */
	public void offer(T model){
		if (!queue.contains(model)){
			queue.offer(model);
			try{
				LOCK.lock();
				task.execute();
			} finally{
				LOCK.unlock();
			}
		}
	}

	/**
	 * add(e) offer(e) put(e) 入列
	 * @param ts
	 */
	public void offer(List<T> ts){
		for (int i = 0; i < ts.size(); i++){
			T t = ts.get(i);
			if (!queue.contains(t)){
				queue.offer(t);
			}
		}
		try{
			LOCK.lock();
			task.execute();
		} finally{
			LOCK.unlock();
		}
	}

	/**
	 * remove() poll() take()出列
	 * @return
	 */
	public T poll(){
		return queue.poll();
	}

	/**
	 * element() peek()查看队列
	 * @return
	 */
	public T peek(){
		return queue.peek();
	}

	/**
	 * remove() poll() take()出列
	 * @param model
	 */
	public void remove(T model){
		queue.remove(model);
	}

	public int size(){
		return queue.size();
	}

	public boolean isEmpty(){
		try{
			LOCK.lock();
			return queue.isEmpty();
		} finally{
			LOCK.unlock();
		}
	}

	public void stop(){
		task.stop();
	}
	
//	//测试队列
//	public static void main(String[] args) {
//		NoticeLog noticeLog = new NoticeLog();
//		noticeLog.setContent("我是发送内容...");
//		JobQueue.getNoticeInstance().offer(noticeLog);
//		noticeLog = new NoticeLog();
//		noticeLog.setContent("我也是发送内容...");
//		JobQueue.getNoticeInstance().offer(noticeLog);
//	}
}
