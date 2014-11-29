// -------------------------------------------------------------------
//  Copyright (c) 2012-2014 TIBCO Software, Inc.
//  All rights reserved.
//  For more information, please contact:
//  TIBCO Software Inc., Palo Alto, California, USA
// -------------------------------------------------------------------
package com.tibco.as.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;

/**
 * This class contains all of the methods of java.sql.Statement which are not
 * implemented by ASStatement.
 *
 */
abstract class AbstractStatement
{

    public void setEscapeProcessing (boolean enable) throws SQLException
    {

    }

    public int getQueryTimeout () throws SQLException
    {
        return 0;
    }

    public void setQueryTimeout (int seconds) throws SQLException
    {

    }

    public void cancel () throws SQLException
    {

    }

    public SQLWarning getWarnings () throws SQLException
    {
        return null;
    }

    public void clearWarnings () throws SQLException
    {

    }

    public void setCursorName (String name) throws SQLException
    {

    }

    public int getResultSetConcurrency () throws SQLException
    {
        return 0;
    }

    public void addBatch (String sql) throws SQLException
    {

    }

    public void clearBatch () throws SQLException
    {

    }

    public int[] executeBatch () throws SQLException
    {
        return null;
    }

    public boolean getMoreResults (int current) throws SQLException
    {
        return false;
    }

    public ResultSet getGeneratedKeys () throws SQLException
    {
        return null;
    }

    public int executeUpdate (String sql, int autoGeneratedKeys) throws SQLException
    {
        return 0;
    }

    public int executeUpdate (String sql, int[] columnIndexes) throws SQLException
    {
        return 0;
    }

    public int executeUpdate (String sql, String[] columnNames) throws SQLException
    {
        return 0;
    }

    public boolean execute (String sql, int autoGeneratedKeys) throws SQLException
    {
        return false;
    }

    public boolean execute (String sql, int[] columnIndexes) throws SQLException
    {
        return false;
    }

    public boolean execute (String sql, String[] columnNames) throws SQLException
    {
        return false;
    }

    public int getResultSetHoldability () throws SQLException
    {
        return 0;
    }

    public void setPoolable (boolean poolable) throws SQLException
    {

    }

    public boolean isPoolable () throws SQLException
    {
        return false;
    }

    public <T> T unwrap (Class<T> iface) throws SQLException
    {
        return null;
    }

    public boolean isWrapperFor (Class<?> iface) throws SQLException
    {
        return false;
    }

    public void closeOnCompletion() throws SQLException
    {

    }

    public boolean isCloseOnCompletion() throws SQLException
    {
        return false;
    }

}