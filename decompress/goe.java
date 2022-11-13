import java.util.concurrent.Executor;
import android.content.Context;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;
import java.util.Map;
import java.util.Collections;
import android.graphics.Bitmap;
import com.google.protos.youtube.api.innertube.ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goe implements ttg
{
    public final Object a;
    private final int b;
    
    public goe(final Surface a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final azf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gnr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gof a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gqd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gqr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gtf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gvy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gww a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gyo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final gyu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public goe(final qcy a, final int b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                final Object a = this.a;
                final bej bej = (bej)o;
                ((gyu)a).V();
                if (bej != null) {
                    bej.c();
                    return;
                }
                break;
            }
            case 19: {
                final Object a2 = this.a;
                final bej bej2 = (bej)o;
                if (bej2 != null) {
                    bej2.w((azf)a2);
                }
                return;
            }
            case 18: {
                final Object a3 = this.a;
                final bej bej3 = (bej)o;
                if (bej3 == null) {
                    return;
                }
                bej3.B((Surface)a3);
                return;
            }
            case 17: {
                final Object a4 = this.a;
                final bej bej4 = (bej)o;
                if (bej4 != null) {
                    bej4.s((azf)a4);
                }
                return;
            }
            case 16: {
                final Object a5 = this.a;
                final bej bej5 = (bej)o;
                if (bej5 != null && !bej5.g()) {
                    final gyu gyu = (gyu)a5;
                    gyu.i = false;
                    gyu.V();
                    bej5.d();
                }
                return;
            }
            case 15: {
                final Object a6 = this.a;
                if (Boolean.TRUE.equals(o)) {
                    final gyo gyo = (gyo)a6;
                    final gxo gxo = new gxo(gyo, 5);
                    final bu od = gyo.a.od();
                    if (od != null) {
                        final wyw b = gyo.b;
                        if (b != null) {
                            b.l((wzz)new wyt(xaa.c(31639)));
                            gyo.b.l((wzz)new wyt(xaa.c(31570)));
                        }
                        final aeea h = gyo.H;
                        final Context e = gyo.e;
                        int n;
                        if (gyo.k.a() == gkv.b) {
                            n = 2132083650;
                        }
                        else {
                            n = 2132083651;
                        }
                        h.am(e, n).setTitle(2132019776).setMessage(2132019775).setCancelable(false).setPositiveButton((CharSequence)((Activity)od).getString(2132019777), (DialogInterface$OnClickListener)new fbm(gyo, (Activity)od, 4)).setNegativeButton((CharSequence)((Activity)od).getString(2132019778), (DialogInterface$OnClickListener)new fbm(gyo, (Runnable)gxo, 5)).show();
                    }
                }
                return;
            }
            case 14: {
                final Object a7 = this.a;
                final MotionEvent motionEvent = (MotionEvent)o;
                if (motionEvent != null) {
                    final Rect rect = new Rect();
                    final gyo gyo2 = (gyo)a7;
                    gyo2.w.b.getGlobalVisibleRect(rect);
                    if (rect.contains((int)motionEvent.getX(), (int)motionEvent.getY())) {
                        ((uae)gyo2.i.a()).c(true);
                    }
                }
                return;
            }
            case 13: {
                final Object a8 = this.a;
                final akrb akrb = (akrb)o;
                if (akrb != null && (akrb.b & 0x20) != 0x0) {
                    aiqj aiqj;
                    if ((aiqj = akrb.e) == null) {
                        aiqj = aiqj.a;
                    }
                    aiqj aiqj2 = aiqj;
                    if (((ahbc)aiqj).ry((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand)) {
                        ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2;
                        final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)((ahbc)aiqj).rx((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand);
                        if ((akrb.b & 0x40) != 0x0) {
                            shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
                            if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.b & 0x40) == 0x0) {
                                final ahaz builder = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.toBuilder();
                                ajum i;
                                if ((i = akrb.g) == null) {
                                    i = ajum.b;
                                }
                                builder.copyOnWrite();
                                final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)builder.instance;
                                i.getClass();
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3.i = i;
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand3.b |= 0x40;
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)builder.build();
                            }
                        }
                        ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand4 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2;
                        if ((akrb.b & 0x80) != 0x0) {
                            if ((shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.b & 0x80) != 0x0) {
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand4 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2;
                            }
                            else {
                                final ahaz builder2 = shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand2.toBuilder();
                                ajum j;
                                if ((j = akrb.h) == null) {
                                    j = ajum.b;
                                }
                                builder2.copyOnWrite();
                                final ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand5 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)builder2.instance;
                                j.getClass();
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand5.j = j;
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand5.b |= 0x80;
                                shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand4 = (ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand)builder2.build();
                            }
                        }
                        final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
                        ahbb.e((ahaq)ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand, (Object)shortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand4);
                        aiqj2 = (aiqj)((ahaz)ahbb).build();
                    }
                    ((vcy)((gnr)a8).b).a(aiqj2);
                }
                return;
            }
            case 12: {
                final Object a9 = this.a;
                final Throwable t = (Throwable)o;
                final gnr gnr = (gnr)a9;
                ((Executor)gnr.c).execute(aeun.h((Runnable)new gxo(gnr, 0, (byte[])null)));
                return;
            }
            case 11: {
                final Object a10 = this.a;
                final MotionEvent motionEvent2 = (MotionEvent)o;
                if (motionEvent2 != null) {
                    ((gww)a10).bA.tu((Object)motionEvent2);
                }
                return;
            }
            case 10: {
                ((gww)this.a).A((Bitmap)o);
                return;
            }
            case 9: {
                final Object a11 = this.a;
                ttr.d("Failed getting video thumbnail as gallery button icon", (Throwable)o);
                ((gww)a11).A(null);
                return;
            }
            case 8: {
                final Object a12 = this.a;
                final uie uie = (uie)o;
                if (uie != null) {
                    ((gvy)a12).g.putAll(Collections.unmodifiableMap((Map<?, ?>)uie.o));
                }
                final gvy gvy = (gvy)a12;
                gvy.c.post((Runnable)new gsb(gvy, 6));
                return;
            }
            case 7: {
                final Object a13 = this.a;
                final Float n2 = (Float)o;
                final gtf gtf = (gtf)a13;
                final gth f = gtf.f;
                f.d(f.u.centerX() + gtf.f.getMeasuredWidth() * n2);
                return;
            }
            case 6: {
                final Object a14 = this.a;
                final Float n3 = (Float)o;
                final gth f2 = ((gtf)a14).f;
                f2.b(f2.r + n3);
                return;
            }
            case 5: {
                final Object a15 = this.a;
                final Float n4 = (Float)o;
                final gth f3 = ((gtf)a15).f;
                f3.c(f3.q + n4);
                return;
            }
            case 4: {
                final Object a16 = this.a;
                final daf daf = (daf)o;
                final gqr gqr = (gqr)a16;
                gqr.d();
                if (daf == null) {
                    gqr.e("Purchase result is null.", "PURCHASE_NULL");
                    return;
                }
                final int a17 = daf.a;
                if (a17 == 0) {
                    gqr.h(6);
                    gqr.e.b("PURCHASE_SUCCESS");
                    if (gqr.f.isPresent()) {
                        gqr.c.a((aiqj)gqr.f.get());
                    }
                    return;
                }
                if (a17 != 1) {
                    gqr.e(String.format("Play Billing error %s while attempting purchase", daf.a), PlayBilling.i(4, a17));
                    return;
                }
                gqr.b();
                return;
            }
            case 3: {
                final Object a18 = this.a;
                final Throwable t2 = (Throwable)o;
                final String value = String.valueOf(String.valueOf(t2));
                String a19;
                if (t2 instanceof gqp) {
                    a19 = ((gqp)t2).a;
                }
                else {
                    a19 = "PURCHASE_FLOW_FAILED";
                }
                ((gqr)a18).f("Unable to purchase. ".concat(value), a19);
                return;
            }
            case 2: {
                final Object a20 = this.a;
                final Throwable t3 = (Throwable)o;
                ttr.d("Unable to show IAP banner.", t3);
                String a21;
                if (t3 instanceof gqp) {
                    a21 = ((gqp)t3).a;
                }
                else {
                    a21 = "ADD_IAP_BANNER_UNABLE_SHOW";
                }
                ((gqd)a20).d.b(a21);
                return;
            }
            case 1: {
                final Object a22 = this.a;
                final BrowseResponseModel browseResponseModel = (BrowseResponseModel)o;
                final qcy qcy = (qcy)a22;
                ((sxr)qcy.a).dismiss();
                ((wyv)qcy.b).pF().D((wzz)new wyt(browseResponseModel.d()));
                final akhz a23 = browseResponseModel.a;
                if (a23.n.size() != 0) {
                    ((vcy)qcy.f).b((List)a23.n);
                }
                if (a23.o.size() != 0) {
                    ((vcy)qcy.f).b((List)a23.o);
                }
                return;
            }
            case 0: {
                final Object a24 = this.a;
                final Throwable t4 = (Throwable)o;
                ttr.d("Error rating", t4);
                ((gof)a24).b.e(t4);
                break;
            }
        }
    }
}
