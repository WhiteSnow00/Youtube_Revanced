import java.io.InputStream;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.io.Serializable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipFile;
import java.util.ArrayList;
import android.util.Log;
import java.io.FileFilter;
import java.util.List;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class au implements Closeable
{
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;
    
    public au(File a, final File c) {
        ((File)a).getPath();
        c.getPath();
        this.a = (File)a;
        this.c = c;
        this.b = c((File)a);
        a = (Error)new File(c, "MultiDex.lock");
        final RandomAccessFile d = new RandomAccessFile((File)a, "rw");
        this.d = d;
        try {
            final FileChannel channel = d.getChannel();
            this.e = channel;
            try {
                ((File)a).getPath();
                this.f = channel.lock();
                ((File)a).getPath();
                return;
            }
            catch (final Error a) {}
            catch (final RuntimeException a) {}
            catch (final IOException ex) {}
            f(this.e);
            throw a;
        }
        catch (final Error a) {}
        catch (final RuntimeException a) {}
        catch (final IOException ex2) {}
        f(this.d);
        throw a;
    }
    
    private static long b(final File file) {
        long lastModified;
        if ((lastModified = file.lastModified()) == -1L) {
            lastModified = -2L;
        }
        return lastModified;
    }
    
    private static long c(File file) {
        file = (File)new RandomAccessFile(file, "r");
        try {
            long n = ((RandomAccessFile)file).length() - 22L;
            if (n < 0L) {
                final StringBuilder sb = new StringBuilder("File too short to be a zip file: ");
                sb.append(((RandomAccessFile)file).length());
                throw new ZipException(sb.toString());
            }
            long n2;
            if ((n2 = -65536L + n) < 0L) {
                n2 = 0L;
            }
            final int reverseBytes = Integer.reverseBytes(101010256);
            while (true) {
                ((RandomAccessFile)file).seek(n);
                if (((RandomAccessFile)file).readInt() == reverseBytes) {
                    ((RandomAccessFile)file).skipBytes(2);
                    ((RandomAccessFile)file).skipBytes(2);
                    ((RandomAccessFile)file).skipBytes(2);
                    ((RandomAccessFile)file).skipBytes(2);
                    final long n3 = Integer.reverseBytes(((RandomAccessFile)file).readInt());
                    final long n4 = Integer.reverseBytes(((RandomAccessFile)file).readInt());
                    final CRC32 crc32 = new CRC32();
                    ((RandomAccessFile)file).seek(n4 & 0xFFFFFFFFL);
                    long n5 = n3 & 0xFFFFFFFFL;
                    final int n6 = (int)Math.min(16384L, n5);
                    final byte[] array = new byte[16384];
                    for (int i = ((RandomAccessFile)file).read(array, 0, n6); i != -1; i = ((RandomAccessFile)file).read(array, 0, (int)Math.min(16384L, n5))) {
                        crc32.update(array, 0, i);
                        n5 -= i;
                        if (n5 == 0L) {
                            break;
                        }
                    }
                    final long value = crc32.getValue();
                    ((RandomAccessFile)file).close();
                    if (value == -1L) {
                        return -2L;
                    }
                    return value;
                }
                else {
                    --n;
                    if (n >= n2) {
                        continue;
                    }
                    throw new ZipException("End Of Central Directory signature not found");
                }
            }
        }
        finally {
            ((RandomAccessFile)file).close();
            while (true) {}
        }
    }
    
    private static SharedPreferences d(final Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }
    
    private final List e() {
        final String s = ".zip";
        final String value = String.valueOf(this.a.getName());
        final File[] listFiles = this.c.listFiles(new dyq(1));
        Serializable concat = value.concat(".classes");
        if (listFiles == null) {
            final StringBuilder sb = new StringBuilder("Failed to list secondary dex dir content (");
            sb.append(this.c.getPath());
            sb.append(").");
            Log.w("MultiDex", sb.toString());
        }
        else {
            for (int i = 0; i < listFiles.length; ++i) {
                final File file = listFiles[i];
                file.getPath();
                file.length();
                if (!file.delete()) {
                    Log.w("MultiDex", "Failed to delete old file ".concat(String.valueOf(file.getPath())));
                }
                else {
                    file.getPath();
                }
            }
        }
        final ArrayList list = new ArrayList();
        final ZipFile zipFile = new ZipFile(this.a);
        try {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("classes");
            sb2.append(2);
            sb2.append(".dex");
            ZipEntry zipEntry = zipFile.getEntry(sb2.toString());
            int n = 2;
        Label_0865_Outer:
            while (zipEntry != null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append((String)concat);
                sb3.append(n);
                sb3.append(s);
                final at at = new at(this.c, sb3.toString());
                list.add(at);
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Extraction is needed for file ");
                sb4.append(at);
                int j = 0;
                int k = 0;
                while (true) {
                    while (j < 3) {
                        if (k == 0) {
                            Object inputStream = zipFile.getInputStream(zipEntry);
                            final File tempFile = File.createTempFile("tmp-".concat((String)concat), s, ((File)at).getParentFile());
                            tempFile.getPath();
                            try {
                                final ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(tempFile)));
                                try {
                                    final ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                                    zipEntry2.setTime(zipEntry.getTime());
                                    zipOutputStream.putNextEntry(zipEntry2);
                                    byte[] array;
                                    for (array = new byte[16384], k = ((InputStream)inputStream).read(array); k != -1; k = ((InputStream)inputStream).read(array)) {
                                        zipOutputStream.write(array, 0, k);
                                    }
                                    zipOutputStream.closeEntry();
                                    zipOutputStream.close();
                                    if (!tempFile.setReadOnly()) {
                                        concat = new(java.io.IOException.class)();
                                        final StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Failed to mark readonly \"");
                                        sb5.append(tempFile.getAbsolutePath());
                                        sb5.append("\" (tmp of \"");
                                        sb5.append(((File)at).getAbsolutePath());
                                        sb5.append("\")");
                                        new IOException(sb5.toString());
                                        throw concat;
                                    }
                                    ((File)at).getPath();
                                    if (tempFile.renameTo((File)at)) {
                                        f((Closeable)inputStream);
                                        tempFile.delete();
                                        try {
                                            at.a = c((File)at);
                                            k = 1;
                                        }
                                        catch (final IOException tempFile) {
                                            inputStream = new StringBuilder();
                                            ((StringBuilder)inputStream).append("Failed to read crc from ");
                                            ((StringBuilder)inputStream).append(at.getAbsolutePath());
                                            Log.w("MultiDex", ((StringBuilder)inputStream).toString(), (Throwable)tempFile);
                                            k = 0;
                                        }
                                        at.getAbsolutePath();
                                        at.length();
                                        if (k == 0) {
                                            at.delete();
                                            if (at.exists()) {
                                                inputStream = new StringBuilder();
                                                ((StringBuilder)inputStream).append("Failed to delete corrupted secondary dex '");
                                                ((StringBuilder)inputStream).append(at.getPath());
                                                ((StringBuilder)inputStream).append("'");
                                                Log.w("MultiDex", ((StringBuilder)inputStream).toString());
                                            }
                                        }
                                        ++j;
                                        continue Label_0865_Outer;
                                    }
                                    concat = new StringBuilder();
                                    ((StringBuilder)concat).append("Failed to rename \"");
                                    ((StringBuilder)concat).append(tempFile.getAbsolutePath());
                                    ((StringBuilder)concat).append("\" to \"");
                                    ((StringBuilder)concat).append(((File)at).getAbsolutePath());
                                    ((StringBuilder)concat).append("\"");
                                    throw new IOException(((StringBuilder)concat).toString());
                                }
                                finally {
                                    zipOutputStream.close();
                                }
                            }
                            finally {
                                f((Closeable)inputStream);
                                tempFile.delete();
                            }
                        }
                        ++n;
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append("classes");
                        sb6.append(n);
                        sb6.append(".dex");
                        zipEntry = zipFile.getEntry(sb6.toString());
                        continue Label_0865_Outer;
                    }
                    if (k != 0) {
                        continue;
                    }
                    break;
                }
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("Could not create zip file ");
                sb7.append(at.getAbsolutePath());
                sb7.append(" for secondary dex (");
                sb7.append(n);
                sb7.append(")");
                throw new IOException(sb7.toString());
            }
            try {
                zipFile.close();
            }
            catch (final IOException ex) {
                Log.w("MultiDex", "Failed to close resource", (Throwable)ex);
            }
            return list;
        }
        finally {
            Label_1036: {
                try {
                    zipFile.close();
                    break Label_1036;
                }
                catch (final IOException ex2) {
                    Log.w("MultiDex", "Failed to close resource", (Throwable)ex2);
                }
            }
            while (true) {}
        }
    }
    
    private static void f(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final IOException ex) {
            Log.w("MultiDex", "Failed to close resource", (Throwable)ex);
        }
    }
    
    private static void g(final Context context, final long n, final long n2, final List list) {
        final SharedPreferences$Editor edit = d(context).edit();
        edit.putLong("timestamp", n);
        edit.putLong("crc", n2);
        edit.putInt("dex.number", list.size() + 1);
        final Iterator iterator = list.iterator();
        int n3 = 2;
        while (iterator.hasNext()) {
            final at at = (at)iterator.next();
            final StringBuilder sb = new StringBuilder("dex.crc.");
            sb.append(n3);
            edit.putLong(sb.toString(), at.a);
            final StringBuilder sb2 = new StringBuilder("dex.time.");
            sb2.append(n3);
            edit.putLong(sb2.toString(), at.lastModified());
            ++n3;
        }
        edit.commit();
    }
    
    public final List a(final Context context, final boolean b) {
        this.a.getPath();
        if (this.f.isValid()) {
            List list2 = null;
            Label_0619: {
                if (!b) {
                    final File a = this.a;
                    final long b2 = this.b;
                    final SharedPreferences d = d(context);
                    if (d.getLong("timestamp", -1L) == b(a)) {
                        if (d.getLong("crc", -1L) == b2) {
                            try {
                                final String concat = String.valueOf(this.a.getName()).concat(".classes");
                                final SharedPreferences d2 = d(context);
                                final int int1 = d2.getInt("dex.number", 1);
                                final ArrayList list = new ArrayList(int1 - 1);
                                int n = 2;
                                while (true) {
                                    list2 = list;
                                    if (n > int1) {
                                        break Label_0619;
                                    }
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(concat);
                                    sb.append(n);
                                    sb.append(".zip");
                                    final at at = new at(this.c, sb.toString());
                                    if (!at.isFile()) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Missing extracted secondary dex file '");
                                        sb2.append(at.getPath());
                                        sb2.append("'");
                                        throw new IOException(sb2.toString());
                                    }
                                    at.a = c((File)at);
                                    final StringBuilder sb3 = new StringBuilder();
                                    sb3.append("");
                                    sb3.append("dex.crc.");
                                    sb3.append(n);
                                    final long long1 = d2.getLong(sb3.toString(), -1L);
                                    final StringBuilder sb4 = new StringBuilder();
                                    sb4.append("");
                                    sb4.append("dex.time.");
                                    sb4.append(n);
                                    final long long2 = d2.getLong(sb4.toString(), -1L);
                                    final long lastModified = at.lastModified();
                                    if (long2 != lastModified || long1 != at.a) {
                                        final StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Invalid extracted dex: ");
                                        sb5.append(at);
                                        sb5.append(" (key \"");
                                        sb5.append("");
                                        sb5.append("\"), expected modification time: ");
                                        sb5.append(long2);
                                        sb5.append(", modification time: ");
                                        sb5.append(lastModified);
                                        sb5.append(", expected crc: ");
                                        sb5.append(long1);
                                        sb5.append(", file crc: ");
                                        sb5.append(at.a);
                                        throw new IOException(sb5.toString());
                                    }
                                    list.add((Object)at);
                                    ++n;
                                }
                            }
                            catch (final IOException ex) {
                                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", (Throwable)ex);
                                list2 = this.e();
                                g(context, b(this.a), this.b, list2);
                                break Label_0619;
                            }
                        }
                    }
                }
                list2 = this.e();
                g(context, b(this.a), this.b, list2);
            }
            list2.size();
            return list2;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
    
    @Override
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}
