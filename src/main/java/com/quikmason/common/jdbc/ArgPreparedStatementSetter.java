package com.quikmason.common.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.SqlParameterValue;
import org.springframework.jdbc.core.SqlTypeValue;
import org.springframework.jdbc.core.StatementCreatorUtils;

public abstract class ArgPreparedStatementSetter {
  public static int setValues(PreparedStatement ps, Object[] args, int startIndex) throws SQLException {
    int j = startIndex;
    if (args != null) {
      for (int i = 0; i < args.length; i++, j++) {
        Object arg = args[i];
        if (arg instanceof SqlParameterValue) {
          SqlParameterValue paramValue = (SqlParameterValue) arg;
          StatementCreatorUtils.setParameterValue(ps, j, paramValue, paramValue.getValue());
        } else {
          StatementCreatorUtils.setParameterValue(ps, j, SqlTypeValue.TYPE_UNKNOWN, arg);
        }
      }
    }
    return j;
  }
  
  public static int setValues(PreparedStatement ps, Object... args) throws SQLException {
    return setValues(ps, args, 1);
  }
}
