import java.util.Iterator;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.$AutoValue_AccountIdentity;
import java.util.Arrays;
import android.app.Activity;
import android.content.Intent;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmt implements znj
{
    public final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public gmt(final aaca a, final znj b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final aczm a, final Map b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final adjk a, final List b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final aslc b, final alat a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gmt(final fch a, final vnh b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final gmu b, final Intent a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gmt(final gtx a, final String b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final hkr a, final Map b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final hwk b, final Activity a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gmt(final String b, final szx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public gmt(final vkd a, final znj b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public gmt(final zkh b, final szx a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final dbi dbi) {
        switch (this.c) {
            default: {
                trn.f("UploadFeedbackPoller", "onErrorResponse", (Throwable)dbi);
                ((adjk)this.a).d.execute((Runnable)new abzn(this, (List)this.b, dbi, 16, (byte[])null));
                return;
            }
            case 11: {
                trn.f("GetOnceUploadFeedbackForPrechecksCommandHandler", "GetUploadFeedback failed", (Throwable)dbi);
                ((aslc)this.b).a();
                return;
            }
            case 10: {
                ((aczm)this.a).a.e((Throwable)dbi);
                final aczl aczl = (aczl)tmy.O((Map)this.b, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag", (Class)aczl.class);
                if (aczl != null) {
                    aczl.i();
                }
                return;
            }
            case 9: {
                ((tny)((hkr)this.a).c).e((Throwable)dbi);
                return;
            }
            case 8: {
                ((znj)this.b).a(dbi);
                return;
            }
            case 7: {
                ((znj)this.b).a(dbi);
                return;
            }
            case 6: {
                ((znj)this.b).a(dbi);
                return;
            }
            case 5: {
                ((szx)this.a).rX(this.b, (Exception)dbi);
            }
            case 4: {
                return;
            }
            case 3: {
                ((hwk)this.b).a.c.e((Throwable)dbi);
                return;
            }
            case 2: {
                trn.d("Error creating post", (Throwable)dbi);
                ((tny)((fch)this.a).e).e((Throwable)dbi);
                final Object b = this.b;
                if (b != null) {
                    ((vnh)b).e((Throwable)dbi);
                }
                return;
            }
            case 1: {
                ((tny)((gtx)this.a).b).e((Throwable)dbi);
                return;
            }
            case 0: {
                trn.l("Failed to load get_settings response");
                ((gmu)this.b).b((Intent)this.a);
            }
        }
    }
}
