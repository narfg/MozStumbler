package org.mozilla.mozstumbler.service.core.logging;

import org.acra.ACRA;
import org.acra.log.ACRALog;

/**
 * Created by victorng on 2014-10-09.
 */
public class MockAcraLog implements ACRALog {
    private static ACRALog origLog;

    public static synchronized void setOriginalLog() {
        if (origLog != null) {
            // We've never tried to turn off the log
            origLog = ACRA.log;
        }
    }

    public static synchronized ACRALog getOriginalLog()
    {
        return origLog;
    }

    @Override
    public int v(String tag, String msg) {
        return 0;
    }

    @Override
    public int v(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int d(String tag, String msg) {
        return 0;
    }

    @Override
    public int d(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int i(String tag, String msg) {
        return 0;
    }

    @Override
    public int i(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int w(String tag, String msg) {
        return 0;
    }

    @Override
    public int w(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public int w(String tag, Throwable tr) {
        return 0;
    }

    @Override
    public int e(String tag, String msg) {
        return 0;
    }

    @Override
    public int e(String tag, String msg, Throwable tr) {
        return 0;
    }

    @Override
    public String getStackTraceString(Throwable tr) {
        return null;
    }
}
