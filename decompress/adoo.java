import android.content.ContentResolver;
import java.io.IOException;
import java.io.InputStream;
import android.text.TextUtils;
import j$.wrapper.java.io.FileInputStreamWrapper;
import java.util.Arrays;
import java.io.File;
import android.net.Uri;
import android.content.res.AssetFileDescriptor;
import android.content.Context;
import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adoo extends adop
{
    protected final boolean a;
    protected FileInputStream b;
    private final Context f;
    private long g;
    private AssetFileDescriptor h;
    
    public adoo(final Uri uri, final Context f, final adgg adgg, final boolean a, final byte[] array, final byte[] array2, final byte[] array3) {
        super(uri, f.getContentResolver(), adgg, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.f = f;
    }
    
    private final boolean b(final File[] array, final String s) {
        return array != null && agpx.aq(Arrays.asList(array), (afbk)new zak(this, s, 3));
    }
    
    public final adot g(final File file) {
        final ContentResolver d = this.d;
        monitorenter(d);
        try {
            final FileInputStream b = this.b;
            Label_0285: {
                if (b != null) {
                    try {
                        FileInputStreamWrapper.getChannel(b).position(0L);
                        break Label_0285;
                    }
                    catch (final Exception ex) {
                        this.e.D("Cannot reset file channel", (Throwable)ex);
                        this.k();
                    }
                }
                if (this.a) {
                    final Uri c = this.c;
                    final boolean equals = "file".equals(c.getScheme());
                    boolean b2 = false;
                    Label_0188: {
                        if (equals) {
                            final String path = c.getPath();
                            if (!TextUtils.isEmpty((CharSequence)path)) {
                                try {
                                    final String canonicalPath = new File(path).getCanonicalPath();
                                    if (!canonicalPath.startsWith(this.f.getFilesDir().getCanonicalPath())) {
                                        if (!this.b(this.f.getExternalFilesDirs((String)null), canonicalPath)) {
                                            if (!this.b(this.f.getExternalCacheDirs(), canonicalPath)) {
                                                break Label_0188;
                                            }
                                        }
                                    }
                                    b2 = true;
                                }
                                catch (final Exception ex2) {
                                    this.e.D("Failed private file check on uri", (Throwable)ex2);
                                }
                            }
                        }
                    }
                    final Context f = this.f;
                    final Uri c2 = this.c;
                    qlx qlx;
                    if (b2) {
                        qlx = qlx.b;
                    }
                    else {
                        qlx = qlx.a;
                    }
                    this.h = qly.a(f, c2, "r", qlx);
                }
                else {
                    this.h = this.d.openAssetFileDescriptor(this.c, "r");
                }
                final AssetFileDescriptor h = this.h;
                if (h == null) {
                    throw new adma(apkh.ad);
                }
                final long length = h.getLength();
                this.g = length;
                if (length == 0L) {
                    throw new adma(apkh.ae);
                }
                try {
                    this.b = this.h.createInputStream();
                    if (this.b == null) {
                        throw new adma(apkh.ac);
                    }
                    if (this.g != -1L) {
                        final adot adot = new adot(this.b, this.g);
                        monitorexit(d);
                        return adot;
                    }
                    final adot adot2 = new adot(this.b);
                    monitorexit(d);
                    return adot2;
                }
                catch (final IOException ex3) {
                    throw new adma(ex3, apkh.af);
                }
            }
            throw new adma(apkh.ae);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    public final void k() {
        final ContentResolver d = this.d;
        monitorenter(d);
        while (true) {
            try {
                try {
                    final FileInputStream b = this.b;
                    if (b != null) {
                        b.close();
                        this.b = null;
                    }
                    final AssetFileDescriptor h = this.h;
                    if (h != null) {
                        h.close();
                        this.h = null;
                    }
                    break Label_0050;
                }
                finally {
                    monitorexit(d);
                    monitorexit(d);
                }
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final boolean n() {
        return true;
    }
}
