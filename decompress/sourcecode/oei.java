import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.os.StrictMode$ThreadPolicy;
import java.io.IOException;
import java.text.ParseException;
import java.io.InputStream;
import java.io.FileInputStream;
import android.os.StrictMode;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oei
{
    private static final afik a;
    
    static {
        a = afik.m("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");
    }
    
    public static oej a(final File file) {
        if (file.isDirectory()) {
            return oej.a;
        }
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        final byte[] array = new byte[62];
        Label_0131: {
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    final oej e = oga.e(array, afna.f((InputStream)fileInputStream, array, 62));
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    return e;
                }
                finally {
                    try {
                        fileInputStream.close();
                    }
                    finally {
                        final Throwable t;
                        oga.f(t, (Throwable)fileInputStream);
                    }
                }
            }
            catch (final ParseException fileInputStream) {}
            catch (final IOException ex) {}
            finally {
                break Label_0131;
            }
            ((afii)((afii)((afii)((afig)oei.a).h()).i((Throwable)fileInputStream)).j("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 82, "ProcSchedStatUtils.java")).t("Failed to read SchedStat for thread %s", (Object)file.getName());
            final oej a = oej.a;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }
    
    public static List b(List a) {
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        final ArrayList list = new ArrayList(((List)a).size());
        final byte[] array = new byte[62];
        try {
            for (final int intValue : a) {
                final StringBuilder sb = new StringBuilder();
                sb.append("/proc/self/task/");
                sb.append(intValue);
                sb.append("/schedstat");
                final File file = new File(sb.toString());
                try {
                    final FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        oga.e(array, afna.f((InputStream)fileInputStream, array, 62));
                        fileInputStream.close();
                    }
                    finally {
                        try {
                            fileInputStream.close();
                        }
                        finally {
                            final Throwable t;
                            oga.f((Throwable)a, t);
                        }
                    }
                }
                catch (final IOException | ParseException ex) {
                    a = oej.a;
                }
                list.add((Object)a);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return list;
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            while (true) {}
        }
    }
}
