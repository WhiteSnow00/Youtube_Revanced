import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import java.util.concurrent.CancellationException;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hug implements tes
{
    public final Object a;
    private final int b;
    
    public hug(final abrj a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final adet a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final aslr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final VoiceSearchActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final gnr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final hzw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final ihi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final jfg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final jih a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final jvl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final kwb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final lmo a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final rjp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final rjx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final tet a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public hug(final zpf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                this.b((Throwable)o);
                return;
            }
            case 19: {
                this.b((Throwable)o);
                return;
            }
            case 18: {
                this.b((Throwable)o);
                return;
            }
            case 17: {
                this.b((Throwable)o);
                return;
            }
            case 16: {
                this.b((Throwable)o);
                return;
            }
            case 15: {
                this.b((Throwable)o);
                return;
            }
            case 14: {
                this.b((Throwable)o);
                return;
            }
            case 13: {
                this.b((Throwable)o);
                return;
            }
            case 12: {
                this.b((Throwable)o);
                return;
            }
            case 11: {
                this.b((Throwable)o);
                return;
            }
            case 10: {
                this.b((Throwable)o);
                return;
            }
            case 9: {
                this.b((Throwable)o);
                return;
            }
            case 8: {
                this.b((Throwable)o);
                return;
            }
            case 7: {
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
        switch (this.b) {
            default: {
                ((tet)this.a).a((Object)val.a);
                return;
            }
            case 19: {
                final gnr gnr = (gnr)this.a;
                ((sxr)gnr.d).a();
                ((tqd)gnr.b).e(t);
                return;
            }
            case 18: {
                final Object a = this.a;
                final int f = fcl.f;
                ((zpf)a).a((dbj)t);
                return;
            }
            case 17: {
                ((rjx)this.a).b.j(1);
                return;
            }
            case 16: {
                ((rjp)this.a).d.setVisibility(0);
                return;
            }
            case 15: {
                final Object b = ((abrj)this.a).b;
                ((tqd)b).d(((tqd)b).b(t));
                return;
            }
            case 14: {
                ((aslr)this.a).b(t);
                return;
            }
            case 13: {
                ((aslr)this.a).b(t);
                return;
            }
            case 12: {
                ((aslr)this.a).b(t);
                return;
            }
            case 11: {
                final Object a2 = this.a;
                final kwb kwb = (kwb)a2;
                kwb.i();
                final ttl a3 = kwb.a.a(t);
                kwb.d.b((CharSequence)a3.b, true);
                kwb.h(((uuh)a2).p, (String)a3.c);
                return;
            }
            case 10: {
                final Object a4 = this.a;
                if (!(t instanceof CancellationException)) {
                    ttr.b("Could not fetch thumbnail");
                    ((jvl)a4).k.h("Could not fetch thumbnail", t);
                }
                return;
            }
            case 9: {
                final VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity)this.a;
                voiceSearchActivity.t(voiceSearchActivity.j());
                return;
            }
            case 8: {
                ((jih)this.a).bd.S("Error occurred getting the history state", t);
                return;
            }
            case 7: {
                final Object a5 = this.a;
                ttr.d("Error rating", t);
                ((tqd)((lmo)a5).a).e(t);
                return;
            }
            case 6: {
                final Object a6 = this.a;
                ttr.d("Error requesting suggested playlist videos.", t);
                final jfg jfg = (jfg)a6;
                jfg.f.b((CharSequence)jfg.a.b(t), true);
                return;
            }
            case 5: {
                ((ProgressBarDialogFragmentController)((ihi)this.a).e.a()).k();
                ttr.d("Error on get download action response", t);
                return;
            }
            case 4: {
                final hzw hzw = (hzw)this.a;
                final wdy b2 = hzw.b;
                if (b2 != null) {
                    b2.g(false);
                }
                Toast.makeText((Context)hzw.a, 2132017993, 0).show();
                return;
            }
            case 3: {
                final Object a7 = this.a;
                dbj dbj;
                if (t instanceof dbj) {
                    dbj = (dbj)t;
                }
                else {
                    dbj = new dbj(t);
                }
                ((zpf)a7).a(dbj);
                return;
            }
            case 2: {
                ((hwl)this.a).bA();
                return;
            }
            case 1: {
                ((adet)this.a).h("Can't delete from ProtoDataStore.", t);
                return;
            }
            case 0: {
                ((adet)this.a).h("Can't delete from ProtoDataStore.", t);
            }
        }
    }
}
