import java.util.function.Consumer;
import java.util.concurrent.TimeoutException;
import android.net.Uri;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achh implements tes
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public achh(final adjv b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public achh(final fdd b, final Optional a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public achh(final String a, final ttg b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public achh(final tag b, final amid a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public achh(final tcc a, final Uri b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        switch (this.c) {
            default: {
                this.b((Throwable)o);
                return;
            }
            case 6: {
                this.b((Throwable)o);
                return;
            }
            case 5: {
                this.b((Throwable)o);
                return;
            }
            case 4: {
                this.b((Throwable)o);
                return;
            }
            case 3: {
                this.b((Throwable)o);
                return;
            }
            case 2: {
                this.b((Throwable)o);
                return;
            }
            case 1: {
                this.b((Throwable)o);
                return;
            }
            case 0: {
                this.b((Throwable)o);
            }
        }
    }
    
    public final void b(final Throwable t) {
        switch (this.c) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                apho apho = apho.b;
                final adjv adjv = (adjv)b;
                final adln l = adjv.l;
                final String s = (String)a;
                l.d(s);
                if (t instanceof TimeoutException) {
                    apho = apho.h;
                }
                adjv.J(s, apho, "Failed to create upload jobs.", t);
                return;
            }
            case 6: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                apho apho2 = apho.e;
                if (t instanceof TimeoutException) {
                    apho2 = apho.k;
                }
                final String s2 = (String)a2;
                final adjv adjv2 = (adjv)b2;
                adjv2.J(s2, apho2, "Failed to cancel the upload.", t);
                adjv2.D(s2, false);
                return;
            }
            case 5: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                apho apho3 = apho.b;
                final adjv adjv3 = (adjv)b3;
                final adln i = adjv3.l;
                final String s3 = (String)a3;
                i.d(s3);
                if (t instanceof TimeoutException) {
                    apho3 = apho.h;
                }
                adjv3.J(s3, apho3, "Failed to create upload job.", t);
                return;
            }
            case 4: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                ttr.b("MetadataUpdateRequest failed: ".concat(String.valueOf(t.getMessage())));
                final amid amid = (amid)a4;
                akui a5;
                if (amid.c == 1) {
                    a5 = (akui)amid.d;
                }
                else {
                    a5 = akui.a;
                }
                if ((a5.d & 0x80000) != 0x0) {
                    final Object a6 = ((tag)b4).a;
                    akui a7;
                    if (amid.c == 1) {
                        a7 = (akui)amid.d;
                    }
                    else {
                        a7 = akui.a;
                    }
                    aiqj aiqj;
                    if ((aiqj = a7.A) == null) {
                        aiqj = aiqj.a;
                    }
                    ((vcy)a6).a(aiqj);
                }
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final Object b5 = this.b;
                t.getMessage();
                acxg.h(t.getMessage());
                acxg.g((String)a8, (ttg)b5);
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final Object b6 = this.b;
                acxg.h("GetAccountException");
                acxg.g((String)a9, (ttg)b6);
                return;
            }
            case 1: {
                final Object b7 = this.b;
                final Object a10 = this.a;
                if (!(t instanceof dbj)) {
                    return;
                }
                final Object a11 = ((fdd)b7).a;
                a11.getClass();
                ((Optional)a10).ifPresent((Consumer)new aaxy((vcy)a11, 15));
                return;
            }
            case 0: {
                final Object a12 = this.a;
                final Object b8 = this.b;
                Exception ex;
                if (t instanceof Exception) {
                    ex = (Exception)t;
                }
                else {
                    ex = new Exception(t);
                }
                ((tcc)a12).sd(b8, ex);
            }
        }
    }
}
