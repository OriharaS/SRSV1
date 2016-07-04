package srs.test;

import java.sql.Connection;

import srs.domain.DBUtil;

public class TestDB {
	public static void main(String[] args) {
		Connection conn = DBUtil.getMySqlConn();
		System.out.println(conn);

}}