import java.util.function.Consumer;
import java.util.concurrent.TimeoutException;
import android.net.Uri;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aciu implements tfv
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public aciu(final adlk b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aciu(final fdg b, final Optional a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aciu(final String a, final tui b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aciu(final tbk b, final amki a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aciu(final tdg a, final Uri b, final int c) {
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
                apka apka = apka.b;
                final adlk adlk = (adlk)b;
                final adnc l = adlk.l;
                final String s = (String)a;
                l.d(s);
                if (t instanceof TimeoutException) {
                    apka = apka.h;
                }
                adlk.J(s, apka, "Failed to create upload jobs.", t);
                return;
            }
            case 6: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                apka apka2 = apka.e;
                if (t instanceof TimeoutException) {
                    apka2 = apka.k;
                }
                final String s2 = (String)a2;
                final adlk adlk2 = (adlk)b2;
                adlk2.J(s2, apka2, "Failed to cancel the upload.", t);
                adlk2.D(s2, false);
                return;
            }
            case 5: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                apka apka3 = apka.b;
                final adlk adlk3 = (adlk)b3;
                final adnc i = adlk3.l;
                final String s3 = (String)a3;
                i.d(s3);
                if (t instanceof TimeoutException) {
                    apka3 = apka.h;
                }
                adlk3.J(s3, apka3, "Failed to create upload job.", t);
                return;
            }
            case 4: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                tut.b("MetadataUpdateRequest failed: ".concat(String.valueOf(t.getMessage())));
                final amki amki = (amki)a4;
                akwi a5;
                if (amki.c == 1) {
                    a5 = (akwi)amki.d;
                }
                else {
                    a5 = akwi.a;
                }
                if ((a5.d & 0x100000) != 0x0) {
                    final Object a6 = ((tbk)b4).a;
                    akwi a7;
                    if (amki.c == 1) {
                        a7 = (akwi)amki.d;
                    }
                    else {
                        a7 = akwi.a;
                    }
                    aisc aisc;
                    if ((aisc = a7.A) == null) {
                        aisc = aisc.a;
                    }
                    ((veh)a6).a(aisc);
                }
                return;
            }
            case 3: {
                final Object a8 = this.a;
                final Object b5 = this.b;
                t.getMessage();
                acyt.h(t.getMessage());
                acyt.g((String)a8, (tui)b5);
                return;
            }
            case 2: {
                final Object a9 = this.a;
                final Object b6 = this.b;
                acyt.h("GetAccountException");
                acyt.g((String)a9, (tui)b6);
                return;
            }
            case 1: {
                final Object b7 = this.b;
                final Object a10 = this.a;
                if (!(t instanceof dbm)) {
                    return;
                }
                final Object a11 = ((fdg)b7).a;
                a11.getClass();
                ((Optional)a10).ifPresent((Consumer)new achl((veh)a11, 0));
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
                ((tdg)a12).c(b8, ex);
            }
        }
    }
}
