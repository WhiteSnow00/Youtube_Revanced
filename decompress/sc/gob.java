import android.support.v7.widget.AppCompatEditText;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.widget.EditText;
import android.os.Build$VERSION;
import com.google.protobuf.MessageLite;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import android.widget.TextView;
import android.content.Context;
import android.app.Activity;
import java.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gob implements Supplier
{
    public final Object a;
    private final int b;
    
    public gob(final Activity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final TextView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final ShortsCreationActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final DefaultWatchPanelViewController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final fmr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final ktk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final uui a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final wgr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final wyv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gob(final zen a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object get() {
        final int b = this.b;
        final int n = 1;
        int integer = 1;
        switch (b) {
            default: {
                final Object a = this.a;
                try {
                    final String stringExtra = ((Activity)a).getIntent().getStringExtra("shorts_edit_thumbnail_parent_activity_key");
                    stringExtra.getClass();
                    return Class.forName(stringExtra);
                }
                catch (final ClassNotFoundException ex) {
                    throw new IllegalArgumentException(ex);
                }
                break;
            }
            case 19: {
                final byte[] byteArrayExtra = ((Activity)this.a).getIntent().getByteArrayExtra("shorts_edit_thumbnail_video_key");
                byteArrayExtra.getClass();
                return xmm.R((byte[])byteArrayExtra, (MessageLite)zhs.a);
            }
            case 18: {
                final zen zen = (zen)this.a;
                int n2 = zen.d.getLineCount();
                Label_0217: {
                    if (Build$VERSION.SDK_INT >= 29) {
                        if (((AppCompatEditText)zen.d).getText() != null) {
                            n2 = n2;
                            if (((AppCompatEditText)zen.d).getText().length() != 0) {
                                break Label_0217;
                            }
                        }
                        n2 = zen.a((EditText)zen.d);
                    }
                }
                final zec d = zen.d;
                return d.d(n2, d.getLineHeight());
            }
            case 17: {
                final zel g = ((zen)this.a).g;
                if (g != null) {
                    g.c();
                }
                return afvn.a;
            }
            case 16: {
                final uui uui = (uui)this.a;
                final vbs m = uui.m;
                final LoadingFrameLayout c = uui.c();
                final Context context = (Context)((atke)m.d).a();
                context.getClass();
                final zmf zmf = (zmf)((atke)m.c).a();
                zmf.getClass();
                final vcy vcy = (vcy)((atke)m.a).a();
                vcy.getClass();
                final acxi acxi = (acxi)((atke)m.b).a();
                acxi.getClass();
                c.getClass();
                return new uww(context, zmf, vcy, acxi, c);
            }
            case 15: {
                final Object a2 = this.a;
                final aujg u = ((uui)a2).u;
                final wyw p = ((uuh)a2).p;
                final Context context2 = (Context)((atke)u.c).a();
                context2.getClass();
                final aekp aekp = (aekp)((atke)u.b).a();
                aekp.getClass();
                final aekp aekp2 = (aekp)((atke)u.a).a();
                p.getClass();
                return new uwv(context2, aekp, aekp2, (uwq)a2, p, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 14: {
                final Object a3 = this.a;
                final uui uui2 = (uui)a3;
                final bx t = uui2.t;
                final wyw p2 = ((uuh)a3).p;
                final vmj a4 = uui2.a;
                final uvr g2 = uui2.s.G(a4, p2, uui2);
                final e e = (e)t.a;
                final Context context3 = (Context)((atke)e.b).a();
                context3.getClass();
                final Object d2 = e.d;
                final aeea aeea = (aeea)((atke)e.c).a();
                aeea.getClass();
                final ziy ziy = (ziy)((atke)e.a).a();
                ziy.getClass();
                p2.getClass();
                return new uxc(context3, (atke)d2, aeea, ziy, p2, a4, g2, (uwq)a3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
            }
            case 13: {
                final Object a5 = this.a;
                final uui uui3 = (uui)a5;
                final ziy o = uui3.o;
                final wyw p3 = ((uuh)a5).p;
                final vmj a6 = uui3.a;
                return o.aa(p3, a6, uui3.s.G(a6, p3, uui3), (uwq)a5, uui3.n, uui3.c);
            }
            case 12: {
                return ((wgr)this.a).e();
            }
            case 11: {
                return new msr((Context)this.a, (byte[])null, (byte[])null, (byte[])null);
            }
            case 10: {
                return ((TextView)this.a).getTextColors();
            }
            case 9: {
                return ((atke)this.a).a();
            }
            case 8: {
                return jtu.c((Context)this.a);
            }
            case 7: {
                return khl.w((Context)this.a);
            }
            case 6: {
                final DefaultWatchPanelViewController defaultWatchPanelViewController = (DefaultWatchPanelViewController)this.a;
                if (!defaultWatchPanelViewController.t(defaultWatchPanelViewController.a.getResources().getConfiguration())) {
                    integer = defaultWatchPanelViewController.a.getResources().getInteger(2131492953);
                }
                return integer;
            }
            case 5: {
                final DefaultWatchPanelViewController defaultWatchPanelViewController2 = (DefaultWatchPanelViewController)this.a;
                int n3;
                if (defaultWatchPanelViewController2.t(defaultWatchPanelViewController2.a.getResources().getConfiguration())) {
                    n3 = n;
                }
                else if (defaultWatchPanelViewController2.e) {
                    n3 = khl.w((Context)defaultWatchPanelViewController2.a);
                }
                else {
                    n3 = defaultWatchPanelViewController2.a.getResources().getInteger(2131492955);
                }
                return n3;
            }
            case 4: {
                return vyg.e(((ktk)this.a).a);
            }
            case 3: {
                return jtu.c((Context)this.a);
            }
            case 2: {
                return jtu.c((Context)this.a);
            }
            case 1: {
                return ((aabo)((fmr)this.a).a.a()).a().l().k().isEmpty() ^ true;
            }
            case 0: {
                return ((wyv)this.a).pF();
            }
        }
    }
}
