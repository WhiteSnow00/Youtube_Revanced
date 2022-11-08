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

public final class accv implements ors
{
    public final arhr a;
    public Handler b;
    private final Context c;
    private final arhr d;
    private final agjt e;
    
    public accv(final Context c, final arhr d, final agjt e, final arhr a, final byte[] array, final byte[] array2) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public static final asgn d(final ajhm ajhm, final orr orr, final arhr arhr) {
        final ort ort = (ort)arhr.a();
        CommandOuterClass$Command commandOuterClass$Command;
        if ((commandOuterClass$Command = ajhm.e) == null) {
            commandOuterClass$Command = CommandOuterClass$Command.getDefaultInstance();
        }
        return ort.a(commandOuterClass$Command, orr);
    }
    
    @Override
    public final agyr a() {
        return (agyr)ajhm.b;
    }
    
    public final void c(final ajhm ajhm, final orr orr) {
        final View a = orr.a;
        if (a == null) {
            return;
        }
        final wwv wwv = (wwv)aaja.t(orr).f();
        final View view = null;
        ajhl ajhl3 = null;
        Label_0293: {
            if (wwv != null) {
                final InteractionLoggingScreen a2 = wwv.a();
                if (a2 != null) {
                    final agza builder = apni.a.createBuilder();
                    final int f = a2.f;
                    builder.copyOnWrite();
                    final apni apni = (apni)builder.instance;
                    apni.b |= 0x2;
                    apni.d = f;
                    builder.copyOnWrite();
                    final apni apni2 = (apni)builder.instance;
                    apni2.b |= 0x8;
                    apni2.f = 0;
                    final apni c = (apni)builder.build();
                    final agza builder2 = ((agzi)ajhl.a).createBuilder();
                    builder2.copyOnWrite();
                    final ajhl ajhl = (ajhl)builder2.instance;
                    c.getClass();
                    ajhl.c = c;
                    ajhl.b |= 0x1;
                    final agza builder3 = apni.a.createBuilder();
                    final agyc f2 = ajhm.f;
                    builder3.copyOnWrite();
                    final apni apni3 = (apni)builder3.instance;
                    f2.getClass();
                    apni3.b |= 0x1;
                    apni3.c = f2;
                    final apni d = (apni)builder3.build();
                    builder2.copyOnWrite();
                    final ajhl ajhl2 = (ajhl)builder2.instance;
                    d.getClass();
                    ajhl2.d = d;
                    ajhl2.b |= 0x2;
                    ajhl3 = (ajhl)builder2.build();
                    break Label_0293;
                }
            }
            ajhl3 = null;
        }
        final asib asib = new asib();
        Object o;
        if ((ajhm.c & 0x8) != 0x0) {
            if ((o = ajhm.g) == null) {
                o = aqdk.a;
            }
        }
        else {
            o = null;
        }
        Object o2;
        if (o == null) {
            o2 = view;
        }
        else {
            final dvt a3 = new dvt(this.c);
            final dsw l = a3.l;
            final olq olq = (olq)this.d.a();
            final ory a4 = orz.a();
            a4.a = (View)a3;
            a4.i(false);
            final dtf b = ComponentTree.b(a3.l, olq.a(l, a4.a(), ((agxl)o).toByteArray(), (osi)null, asib));
            b.d = false;
            a3.B(b.a());
            a3.measure(View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize((int)tmy.bi(this.c).first), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize((int)tmy.bi(this.c).second), Integer.MIN_VALUE));
            a3.layout(0, 0, a3.getMeasuredWidth() - 1, a3.getMeasuredHeight() - 1);
            o2 = a3;
        }
        final agjt e = this.e;
        final String d2 = ajhm.d;
        final Uri parse = Uri.parse(d2);
        final aepj aepj = new aepj(asib);
        if (!TextUtils.isEmpty((CharSequence)d2)) {
            if (parse != null) {
                final ClipData rawUri = ClipData.newRawUri((CharSequence)d2, parse);
                if (ajhl3 != null) {
                    a.setOnDragListener((View$OnDragListener)new acqw(e, a, ajhl3, aepj, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
                }
                View$DragShadowBuilder view$DragShadowBuilder;
                if (o2 != null) {
                    view$DragShadowBuilder = new View$DragShadowBuilder((View)o2);
                }
                else {
                    view$DragShadowBuilder = new View$DragShadowBuilder(a);
                }
                final boolean az = ana.az(a, rawUri, view$DragShadowBuilder);
                if (o2 != null) {
                    qcj.u((Runnable)(e.a = new abwg(a, view$DragShadowBuilder, 12)));
                }
                if (az) {
                    e.k(ajhl3, 2);
                }
            }
        }
    }
}
