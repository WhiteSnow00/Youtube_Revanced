import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import android.view.View$DragShadowBuilder;
import android.view.View$OnDragListener;
import android.content.ClipData;
import android.text.TextUtils;
import android.net.Uri;
import android.view.View$MeasureSpec;
import com.facebook.litho.ComponentTree;
import android.view.View;
import android.os.Looper;
import android.view.View$OnTouchListener;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acgi implements ott
{
    public final arna a;
    public Handler b;
    private final Context c;
    private final arna d;
    private final agnl e;
    
    public acgi(final Context c, final arna d, final agnl e, final arna a, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public static final asjy d(final ajlp ajlp, final ots ots, final arna arna) {
        final otu otu = (otu)arna.a();
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = ajlp.e) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        return otu.a(commandOuterClass$Command, ots);
    }
    
    public final ahci a() {
        return ajlp.b;
    }
    
    public final asjy b(final Object o, final ots ots) {
        final ajlp ajlp = (ajlp)o;
        asjy asjy;
        if (ajlp.d.isEmpty() && (ajlp.c & 0x2) == 0x0) {
            asjy = asjy.f();
        }
        else if (ajlp.d.isEmpty()) {
            asjy = d(ajlp, ots, this.a);
        }
        else if ((ajlp.c & 0x2) != 0x0) {
            final View a = ots.a;
            if (a == null) {
                asjy = asjy.f();
            }
            else {
                a.setOnTouchListener((View$OnTouchListener)new acgg(this, ajlp, ots));
                (this.b = new acgh(this, Looper.getMainLooper(), ajlp, ots)).sendEmptyMessageDelayed(1, 200L);
                asjy = asjy.f();
            }
        }
        else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c(ajlp, ots);
            asjy = asjy.f();
        }
        else {
            asjy = asjy.u((asmc)new zgg(this, ajlp, ots, 4)).F(aslh.a());
        }
        return asjy;
    }
    
    public final void c(final ajlp ajlp, final ots ots) {
        final View a = ots.a;
        if (a == null) {
            return;
        }
        final xab xab = (xab)aamr.s(ots).f();
        final View view = null;
        ajlo ajlo3 = null;
        Label_0293: {
            if (xab != null) {
                final InteractionLoggingScreen a2 = xab.a();
                if (a2 != null) {
                    final ahcr builder = apry.a.createBuilder();
                    final int f = a2.f;
                    builder.copyOnWrite();
                    final apry apry = (apry)builder.instance;
                    apry.b |= 0x2;
                    apry.d = f;
                    builder.copyOnWrite();
                    final apry apry2 = (apry)builder.instance;
                    apry2.b |= 0x8;
                    apry2.f = 0;
                    final apry c = (apry)builder.build();
                    final ahcr builder2 = ajlo.a.createBuilder();
                    builder2.copyOnWrite();
                    final ajlo ajlo = (ajlo)builder2.instance;
                    c.getClass();
                    ajlo.c = c;
                    ajlo.b |= 0x1;
                    final ahcr builder3 = apry.a.createBuilder();
                    final ahbt f2 = ajlp.f;
                    builder3.copyOnWrite();
                    final apry apry3 = (apry)builder3.instance;
                    f2.getClass();
                    apry3.b |= 0x1;
                    apry3.c = f2;
                    final apry d = (apry)builder3.build();
                    builder2.copyOnWrite();
                    final ajlo ajlo2 = (ajlo)builder2.instance;
                    d.getClass();
                    ajlo2.d = d;
                    ajlo2.b |= 0x2;
                    ajlo3 = (ajlo)builder2.build();
                    break Label_0293;
                }
            }
            ajlo3 = null;
        }
        final aslm aslm = new aslm();
        aqiq aqiq;
        if ((ajlp.c & 0x8) != 0x0) {
            if ((aqiq = ajlp.g) == null) {
                aqiq = aqiq.a;
            }
        }
        else {
            aqiq = null;
        }
        Object o;
        if (aqiq == null) {
            o = view;
        }
        else {
            final dvx a3 = new dvx(this.c);
            final dta l = a3.l;
            final onm onm = (onm)this.d.a();
            final otz a4 = oua.a();
            a4.a = (View)a3;
            a4.i(false);
            final dtj b = ComponentTree.b(a3.l, onm.a(l, a4.a(), aqiq.toByteArray(), (ouj)null, aslm));
            b.d = false;
            a3.B(b.a());
            a3.measure(View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize((int)tqf.bi(this.c).first), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize((int)tqf.bi(this.c).second), Integer.MIN_VALUE));
            a3.layout(0, 0, a3.getMeasuredWidth() - 1, a3.getMeasuredHeight() - 1);
            o = a3;
        }
        final agnl e = this.e;
        final String d2 = ajlp.d;
        final Uri parse = Uri.parse(d2);
        final adzx adzx = new adzx(aslm);
        if (!TextUtils.isEmpty((CharSequence)d2)) {
            if (parse != null) {
                final ClipData rawUri = ClipData.newRawUri((CharSequence)d2, parse);
                if (ajlo3 != null) {
                    a.setOnDragListener((View$OnDragListener)new acum(e, a, ajlo3, adzx, (byte[])null, (byte[])null, (byte[])null));
                }
                View$DragShadowBuilder view$DragShadowBuilder;
                if (o != null) {
                    view$DragShadowBuilder = new View$DragShadowBuilder((View)o);
                }
                else {
                    view$DragShadowBuilder = new View$DragShadowBuilder(a);
                }
                final boolean az = anc.az(a, rawUri, view$DragShadowBuilder);
                if (o != null) {
                    qem.t((Runnable)(e.a = new abse(a, view$DragShadowBuilder, 16)));
                }
                if (az) {
                    e.k(ajlo3, 2);
                }
            }
        }
    }
}
