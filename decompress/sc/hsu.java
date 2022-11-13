import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import java.text.NumberFormat;
import android.widget.ProgressBar;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.content.res.Resources;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View$OnClickListener;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.File;
import android.widget.RelativeLayout;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import java.util.Collection;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
import android.widget.LinearLayout;
import java.util.Map;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsu implements acko
{
    public final Activity a;
    public final Executor b;
    public final vcy c;
    public final acgs d;
    public final Map e;
    public final LinearLayout f;
    public boolean g;
    public boolean h;
    public pvh i;
    private final adll j;
    private final adlj k;
    private final zmf l;
    private final hst m;
    private final gfl n;
    private ackm o;
    private PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer p;
    private ListenableFuture q;
    private final wyv r;
    private final adpp s;
    
    public hsu(final Activity a, final Executor b, final zmf l, final adll j, final adpp s, final vcy c, final acgs d, final acpk acpk, final wyv r, final byte[] array) {
        this.a = a;
        this.b = b;
        this.l = l;
        this.j = j;
        this.k = (adlj)new jvk(this, 1);
        this.s = s;
        this.c = c;
        this.d = d;
        this.n = new gfl((Context)a, acpk);
        this.f = (LinearLayout)LayoutInflater.from((Context)a).inflate(2131625278, (ViewGroup)null);
        this.e = new HashMap();
        this.g = false;
        this.m = new hst(this);
        this.r = r;
    }
    
    public static void g(final Throwable t) {
        ttr.d("Error occurred getting resumable uploads", t);
    }
    
    private final boolean m() {
        return this.f.findViewWithTag((Object)"WATCH_STORY_TAG") != null;
    }
    
    @Override
    public final View a() {
        return (View)this.f;
    }
    
    public final void b(final String s) {
        if (this.e.get(s) != null) {
            this.e.remove(s);
            final View viewWithTag = this.f.findViewWithTag((Object)s);
            ((ImageView)viewWithTag.findViewById(2131431077)).setImageDrawable((Drawable)null);
            this.f.removeView(viewWithTag);
        }
    }
    
    @Override
    public final void c(final acku acku) {
        this.j.c();
        this.j.f(this.k);
        final boolean g = this.g;
        int i = 0;
        if (g) {
            this.g = false;
            if (!this.q.isDone()) {
                this.q.cancel(true);
            }
            this.s.m((adle)this.m);
        }
        for (ArrayList list = new ArrayList(this.e.keySet()); i < list.size(); ++i) {
            this.b((String)list.get(i));
        }
        this.f.removeAllViews();
    }
    
    public final void d(final admv admv) {
        admt admt;
        if ((admt = admt.a(admv.l)) == null) {
            admt = admt.a;
        }
        if (admt == admt.d && this.l.c() != null) {
            this.l.c().d();
            if (this.l.c().d().equals(admv.e)) {
                final String k = admv.k;
                tvb.n(k);
                gll gll;
                if ((gll = this.e.get(k)) == null) {
                    final ahaz builder = ((ahbh)amgu.a).createBuilder();
                    final ajut g = acak.g(new String[] { this.a.getResources().getString(2132019466) });
                    builder.copyOnWrite();
                    final amgu amgu = (amgu)builder.instance;
                    g.getClass();
                    amgu.c = g;
                    amgu.b |= 0x1;
                    final ahaz builder2 = ((ahbh)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.a).createBuilder();
                    final String i = admv.k;
                    builder2.copyOnWrite();
                    final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)builder2.instance;
                    i.getClass();
                    deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.b |= 0x4;
                    deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.d = i;
                    final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2 = (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint)builder2.build();
                    final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
                    ahbb.e((ahaq)DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint, (Object)deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint2);
                    builder.copyOnWrite();
                    final amgu amgu2 = (amgu)builder.instance;
                    final aiqj e = (aiqj)((ahaz)ahbb).build();
                    e.getClass();
                    amgu2.e = e;
                    amgu2.b |= 0x10;
                    final ahaz builder3 = ((ahbh)amgp.a).createBuilder();
                    builder3.copyOnWrite();
                    final amgp amgp = (amgp)builder3.instance;
                    final amgu d = (amgu)builder.build();
                    d.getClass();
                    amgp.d = d;
                    amgp.b |= 0x2;
                    final amgp amgp2 = (amgp)builder3.build();
                    final ahaz builder4 = ((ahbh)amgs.a).createBuilder();
                    builder4.bp(amgp2);
                    gll = new gll(k, (amgs)builder4.build(), admv.f);
                    this.e.put(k, gll);
                    this.j.b(this.l.c(), admv.k, (String)null, admv.ab);
                }
                adms adms;
                if ((adms = admv.N) == null) {
                    adms = adms.a;
                }
                gll.c(adms);
                if (admv.aj) {
                    gll.b();
                }
                final String j = admv.k;
                final gll gll2 = this.e.get(j);
                if (gll2 != null) {
                    if (this.f.findViewWithTag((Object)j) == null) {
                        final RelativeLayout relativeLayout = (RelativeLayout)LayoutInflater.from((Context)this.a).inflate(2131625276, (ViewGroup)this.f, false);
                        relativeLayout.setTag((Object)j);
                        final ImageView imageView = (ImageView)relativeLayout.findViewById(2131431077);
                        final Uri a = gll2.a;
                        if (a != null) {
                            final String queryParameter = a.getQueryParameter("videoThumbnailFilePath");
                            if (queryParameter != null && new File(queryParameter).exists()) {
                                final int n = (int)this.a.getResources().getDimension(2131169290);
                                final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                                bitmapFactory$Options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(queryParameter, bitmapFactory$Options);
                                final int outHeight = bitmapFactory$Options.outHeight;
                                final int outWidth = bitmapFactory$Options.outWidth;
                                int inSampleSize;
                                if (outHeight <= n && outWidth <= n) {
                                    inSampleSize = 1;
                                }
                                else {
                                    final int n2 = outHeight / 2;
                                    final int n3 = outWidth / 2;
                                    int n4 = 1;
                                    while (true) {
                                        inSampleSize = n4;
                                        if (n2 / n4 < n) {
                                            break;
                                        }
                                        inSampleSize = n4;
                                        if (n3 / n4 < n) {
                                            break;
                                        }
                                        n4 += n4;
                                    }
                                }
                                bitmapFactory$Options.inSampleSize = inSampleSize;
                                bitmapFactory$Options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(queryParameter, bitmapFactory$Options);
                                if (decodeFile != null) {
                                    imageView.setImageBitmap(decodeFile);
                                    this.h = true;
                                }
                            }
                        }
                        ((ImageView)relativeLayout.findViewById(2131431072)).setOnClickListener((View$OnClickListener)new hqd(this, admv, 4));
                        this.k(j);
                        this.f.addView((View)relativeLayout, (int)(this.m() ? 1 : 0));
                        this.l(gll2);
                        this.f.setVisibility(0);
                        if (tsy.e(this.f.getContext())) {
                            tsy.c(this.f.getContext(), (View)relativeLayout, (CharSequence)this.f.getContext().getString(2132019464));
                        }
                    }
                }
            }
        }
    }
    
    public final void f() {
        final pvh i = this.i;
        if (i != null) {
            ((utv)i.a).E();
        }
        this.i();
    }
    
    public final void h(final ackm o, final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer p2) {
        this.o = o;
        this.p = p2;
        this.f.removeAllViews();
        this.r.pF().t((wzz)new wyt(p2.f), (alhi)null);
        final zme c = this.l.c();
        this.j.a(this.k);
        this.s.l((adle)this.m);
        final ListenableFuture j = this.s.j(c);
        this.q = j;
        boolean b = true;
        this.g = true;
        teu.k(j, this.b, (tes)gnn.l, (tet)new hgd(this, 3));
        final PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer p3 = this.p;
        final int b2 = p3.b;
        anuv anuv;
        if ((anuv = p3.e) == null) {
            anuv = anuv.a;
        }
        if ((b2 & 0x8) == 0x0) {
            b = false;
        }
        final aicz b3 = hko.b(b, anuv);
        if (b3 != null) {
            final View inflate = LayoutInflater.from((Context)this.a).inflate(2131625277, (ViewGroup)this.f, false);
            inflate.setTag((Object)"ADD_TO_STORY_TAG");
            final TextView textView = (TextView)inflate.findViewById(2131429482);
            final ImageView imageView = (ImageView)inflate.findViewById(2131429286);
            final Resources resources = this.a.getResources();
            final gfl n = this.n;
            akdi akdi;
            if ((akdi = b3.g) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            imageView.setImageDrawable(resources.getDrawable(n.a(akdh)));
            ajut ajut;
            if ((ajut = b3.i) == null) {
                ajut = ajut.a;
            }
            textView.setText((CharSequence)acak.b(ajut));
            inflate.setOnClickListener((View$OnClickListener)new hqd(this, b3, 6));
            this.f.addView(inflate, 0);
            this.r.pF().t((wzz)new wyt(b3.w), (alhi)null);
        }
        anuv anuv2;
        if ((anuv2 = this.p.d) == null) {
            anuv2 = anuv.a;
        }
        final int cj = aqsx.cj(((ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer)anuv2.rx((ahaq)ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.channelReelAvatarRenderer)).e);
        if (cj != 0) {
            if (cj == 3) {
                return;
            }
        }
        this.j();
    }
    
    public final void i() {
        final ackm o = this.o;
        if (o == null) {
            return;
        }
        final acrh acrh = (acrh)o.c("sectionListController");
        if (acrh != null) {
            acrh.om();
        }
    }
    
    public final void j() {
        if (this.m()) {
            return;
        }
        final ahaz builder = ((ahbh)amqg.a).createBuilder();
        builder.copyOnWrite();
        final amqg amqg = (amqg)builder.instance;
        amqg.b |= 0x2;
        amqg.d = 6827;
        final amqg amqg2 = (amqg)builder.build();
        anuv anuv;
        if ((anuv = this.p.d) == null) {
            anuv = anuv.a;
        }
        final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer = (ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer)aakt.u(anuv);
        if (channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer == null) {
            return;
        }
        this.r.pF().t((wzz)new wyt(channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.h), (alhi)null);
        aiqj aiqj;
        if ((aiqj = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.d) == null) {
            aiqj = aiqj.a;
        }
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (Object)reelWatchEndpointOuterClass$ReelWatchEndpoint);
        ahbb.e((ahaq)amqf.b, (Object)amqg2);
        final aiqj aiqj2 = (aiqj)((ahaz)ahbb).build();
        final View inflate = LayoutInflater.from((Context)this.a).inflate(2131625279, (ViewGroup)this.f, false);
        final ImageView imageView = (ImageView)inflate.findViewById(2131427735);
        final acgs d = this.d;
        aotp aotp;
        if ((aotp = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.c) == null) {
            aotp = aotp.a;
        }
        d.j(imageView, aotp, null);
        inflate.setTag((Object)"WATCH_STORY_TAG");
        inflate.setOnClickListener((View$OnClickListener)new hqd(this, aiqj2, 5));
        this.f.addView(inflate, 0);
    }
    
    public final void k(final String s) {
        final gll gll = this.e.get(s);
        final View viewWithTag = this.f.findViewWithTag((Object)s);
        if (gll != null) {
            if (viewWithTag != null) {
                final ProgressBar progressBar = (ProgressBar)viewWithTag.findViewById(2131431074);
                ((TextView)viewWithTag.findViewById(2131431073)).setText((CharSequence)this.a.getResources().getString(2132019470, new Object[] { NumberFormat.getPercentInstance().format(gll.a()) }));
                final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)progressBar, "progress", new int[] { (int)(gll.a() * 95.0) });
                ofInt.setDuration(250L);
                ofInt.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
                ofInt.start();
            }
        }
    }
    
    public final void l(final gll gll) {
        final View viewWithTag = this.f.findViewWithTag((Object)gll.b);
        if (viewWithTag == null) {
            return;
        }
        final ViewGroup viewGroup = (ViewGroup)viewWithTag.findViewById(2131431075);
        final TextView textView = (TextView)viewWithTag.findViewById(2131431076);
        if (gll.c || gll.i == 3 || gll.d) {
            viewGroup.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(2132019469);
            return;
        }
        final int h = gll.h;
        if (h == 2) {
            viewGroup.setVisibility(8);
            textView.setText(2132019471);
            textView.setVisibility(0);
            return;
        }
        if (h == 1) {
            viewGroup.setVisibility(8);
            textView.setText(2132019472);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        viewGroup.setVisibility(0);
        this.k(gll.b);
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.h(ackm, (PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer)o);
    }
}
