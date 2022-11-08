import java.util.concurrent.Executor;
import java.io.IOException;
import android.text.TextUtils;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fel
{
    public lpy b;
    Object c;
    final /* synthetic */ fem d;
    public final avt e;
    
    public fel(final fem d, final avt e, final byte[] array, final byte[] array2) {
        this.d = d;
        this.e = e;
    }
    
    protected abstract Object a(final byte[] p0);
    
    protected abstract byte[] b(final Object p0);
    
    public final Object c() {
        synchronized (this) {
            Label_0104: {
                if (this.b != null && this.c != null) {
                    break Label_0104;
                }
                final avt e = this.e;
                byte[] d;
                if (!((File)e.a).exists()) {
                    d = null;
                }
                else {
                    d = afnj.d((File)e.a);
                }
                lpy b = null;
                Label_0080: {
                    if (d != null) {
                        try {
                            b = (lpy)agzi.parseFrom((agzi)lpy.a, d, ExtensionRegistryLite.getGeneratedRegistry());
                            break Label_0080;
                        }
                        catch (final ahab ahab) {
                            this.d();
                        }
                    }
                    b = null;
                }
                this.b = b;
                if (b == null) {
                    return null;
                }
                try {
                    this.c = this.a(b.e.I());
                    final lpy b2 = this.b;
                    b2.getClass();
                    final String c = b2.c;
                    if (this.d.b.t()) {
                        if (TextUtils.equals((CharSequence)this.d.b.c().d(), (CharSequence)c)) {
                            return this.c;
                        }
                    }
                    else if (TextUtils.isEmpty((CharSequence)c)) {
                        return this.c;
                    }
                    return null;
                }
                catch (final IOException ex) {
                    this.d();
                    return null;
                }
            }
            return null;
        }
    }
    
    public final void d() {
        synchronized (this) {
            this.e.i();
            this.b = null;
            this.c = null;
        }
    }
    
    public final void e(Object c) {
        synchronized (this) {
            final agza builder = ((agzi)lpy.a).createBuilder();
            if (this.d.b.t()) {
                final String d = this.d.b.c().d();
                builder.copyOnWrite();
                final lpy lpy = (lpy)builder.instance;
                lpy.b |= 0x1;
                lpy.c = d;
            }
            final long c2 = this.d.c.c();
            builder.copyOnWrite();
            final lpy lpy2 = (lpy)builder.instance;
            lpy2.b |= 0x2;
            lpy2.d = c2;
            final agyc x = agyc.x(this.b(c));
            builder.copyOnWrite();
            final lpy lpy3 = (lpy)builder.instance;
            lpy3.b |= 0x4;
            lpy3.e = x;
            this.b = (lpy)builder.build();
            this.c = c;
            final Executor d2 = this.d.d;
            c = new exu(this, 6);
            d2.execute(aesm.h((Runnable)c));
        }
    }
}
