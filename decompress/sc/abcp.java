import java.util.Observable;
import java.util.Iterator;
import android.content.ClipData;
import android.content.ClipboardManager;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.Date;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Locale;
import android.view.View;
import android.os.Build$VERSION;
import android.os.Build;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.json.JSONObject;
import android.os.BatteryManager;
import android.content.Context;
import java.util.HashMap;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcp implements Observer, zbi, abcm, abcq
{
    private final zdk A;
    private final tqd B;
    private final abpu C;
    private int D;
    private long E;
    private final asiq F;
    private ibx G;
    private final ttl H;
    public final abcn a;
    public final afaq b;
    public final afaq c;
    public String d;
    public String e;
    public int f;
    public int g;
    public FormatStreamModel h;
    public FormatStreamModel i;
    public vjj j;
    public alkt[] k;
    public alkt[] l;
    public final abco m;
    public boolean n;
    public long o;
    public final HashMap p;
    public float q;
    public boolean r;
    public final ibx s;
    public final wqf t;
    private final Context u;
    private final aezp v;
    private final zbh w;
    private final zis x;
    private final tjm y;
    private final ttd z;
    
    public abcp(final abcn a, final Context u, final aezp v, final zbh w, final zis x, final tjm y, final ttd z, final zdk a2, final afaq b, final afaq c, final tqd b2, final abpu c2, final ttl h, final byte[] array) {
        a.getClass();
        this.a = a;
        ((abcr)a).C = (abcm)this;
        u.getClass();
        this.u = u;
        w.getClass();
        this.w = w;
        x.getClass();
        this.x = x;
        y.getClass();
        this.y = y;
        z.getClass();
        this.z = z;
        this.A = a2;
        b.getClass();
        this.b = b;
        this.c = c;
        this.B = b2;
        this.v = v;
        this.C = c2;
        this.H = h;
        this.m = new abco(this);
        this.t = new wqf(this, 10);
        this.s = new ibx(this, 13);
        this.F = new asiq();
        final BatteryManager batteryManager = (BatteryManager)u.getSystemService("batterymanager");
        this.p = new HashMap();
    }
    
    private final float l() {
        final FormatStreamModel i = this.i;
        float n;
        if (i != null && i.x()) {
            n = this.i.b();
        }
        else {
            n = this.q;
        }
        return n;
    }
    
    private static void m(final JSONObject jsonObject, final alkt[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final alkt alkt = array[i];
                final String e = alkt.e;
                if (e.startsWith("innertube.build.") || e.equals("e") || e.equals("logged_in")) {
                    final String e2 = alkt.e;
                    String s;
                    if (alkt.c == 2) {
                        s = (String)alkt.d;
                    }
                    else {
                        s = "";
                    }
                    jsonObject.put(e2, (Object)s);
                }
            }
        }
    }
    
    public final void a(final zbx zbx) {
        synchronized (this) {
            this.D += zbx.b;
            this.E += zbx.c;
            this.r = zbx.d;
        }
    }
    
    public final void b(final Exception ex) {
    }
    
    public final void c(final int n) {
    }
    
    public final void d(final zbx zbx) {
    }
    
    public final void e() {
        this.h();
    }
    
    public final float f() {
        synchronized (this) {
            final int d = this.D;
            float n;
            if (d == 0) {
                n = 0.0f;
            }
            else {
                n = this.E * 8L / (d / 1000.0f);
            }
            this.E = 0L;
            this.D = 0;
            return n;
        }
    }
    
    public final void g() {
        if (!this.n) {
            if (this.G == null) {
                this.G = new ibx(this, 14);
            }
            this.n = true;
            final abcn a = this.a;
            final abcr abcr = (abcr)a;
            if (abcr.e == null) {
                LayoutInflater.from(abcr.getContext()).inflate(2131624327, (ViewGroup)a);
                abcr.e = abcr.findViewById(2131430039);
                (abcr.f = abcr.findViewById(2131428701)).setOnClickListener((View$OnClickListener)a);
                abcr.f.setVisibility(0);
                (abcr.g = abcr.findViewById(2131428489)).setOnClickListener((View$OnClickListener)a);
                abcr.g.setVisibility(0);
                abcr.h = (TextView)abcr.findViewById(2131428655);
                abcr.i = (TextView)abcr.findViewById(2131432314);
                abcr.j = (TextView)abcr.findViewById(2131428508);
                abcr.l = (TextView)abcr.findViewById(2131430464);
                abcr.m = (TextView)abcr.findViewById(2131430429);
                abcr.n = (TextView)abcr.findViewById(2131432310);
                abcr.q = (TextView)abcr.findViewById(2131427655);
                abcr.r = (TextView)abcr.findViewById(2131432405);
                abcr.s = (TextView)abcr.findViewById(2131427778);
                abcr.t = (ImageView)abcr.findViewById(2131427779);
                abcr.u = (TextView)abcr.findViewById(2131430786);
                abcr.v = (ImageView)abcr.findViewById(2131430787);
                abcr.w = (TextView)abcr.findViewById(2131432379);
                abcr.x = (TextView)abcr.findViewById(2131428765);
                abcr.y = (TextView)abcr.findViewById(2131427798);
                abcr.z = (TextView)abcr.findViewById(2131427797);
                abcr.k = (TextView)abcr.findViewById(2131430005);
                abcr.A = abcr.findViewById(2131429493);
                abcr.B = (TextView)abcr.findViewById(2131429492);
                abcr.o = abcr.findViewById(2131432313);
                abcr.p = (TextView)abcr.findViewById(2131432312);
                abcr.E = (TextView)abcr.findViewById(2131428435);
                abcr.D = abcr.findViewById(2131428436);
                abcr.A.measure(0, 0);
                final int az = tpe.aZ(abcr.getResources().getDisplayMetrics(), 100);
                final int n = abcr.A.getMeasuredHeight() - 1;
                abcr.F = new uhb(az, n, abcr.a, abcr.b);
                abcr.G = new uhb(az, n, abcr.c, abcr.d);
                abcr.y.setVisibility(8);
                abcr.z.setVisibility(8);
            }
            abcr.e.setVisibility(0);
            final abcn a2 = this.a;
            final String manufacturer = Build.MANUFACTURER;
            final String model = Build.MODEL;
            final String release = Build$VERSION.RELEASE;
            final StringBuilder sb = new StringBuilder();
            sb.append(manufacturer);
            sb.append(" ");
            sb.append(model);
            sb.append(" ");
            sb.append(release);
            ((abcr)a2).h.setText((CharSequence)sb.toString());
            this.a.c(this.h);
            this.a.b(this.i);
            this.k();
            this.a.d((zdj)this.A.a());
            this.j();
            this.i();
            this.F.f(this.G.lX(this.C));
            this.F.c(((tmx)((aezv)this.v).a).d().R().P(asil.a()).q((asjr)aaxs.l).am((asjm)new abci(this, 6)));
            this.w.d((zbi)this);
            this.A.addObserver((Observer)this);
            return;
        }
        this.h();
    }
    
    public final void h() {
        if (this.n) {
            this.n = false;
            final View e = ((abcr)this.a).e;
            if (e != null) {
                e.setVisibility(8);
            }
            this.F.b();
            this.w.e((zbi)this);
            this.A.deleteObserver((Observer)this);
        }
    }
    
    public final void i() {
        final Object a = this.c.a();
        final abcn a2 = this.a;
        final yon yon = (yon)a;
        ((abcr)a2).k.setText((CharSequence)tvb.i(yon.f));
        final abcn a3 = this.a;
        final String i = tvb.i(yon.c);
        final abcr abcr = (abcr)a3;
        if (abcr.E != null) {
            if (abcr.D != null) {
                if (i.isEmpty()) {
                    abcr.E.setVisibility(8);
                    abcr.D.setVisibility(8);
                }
                else {
                    abcr.E.setVisibility(0);
                    abcr.D.setVisibility(0);
                    abcr.E.setText((CharSequence)i);
                }
            }
        }
        ((abcr)this.a).l.setText((CharSequence)abcr.e(tvb.i(yon.d)));
        ((abcr)this.a).m.setText((CharSequence)abcr.e(tvb.i(yon.e)));
    }
    
    public final void j() {
        ((abcr)this.a).j.setText((CharSequence)this.e);
        ((abcr)this.a).i.setText((CharSequence)this.d);
        final abcn a = this.a;
        final vjj j = this.j;
        final abcr abcr = (abcr)a;
        if (abcr.p == null) {
            return;
        }
        if (j != null && j != vjj.e && j != vjj.a) {
            abcr.o.setVisibility(0);
            abcr.p.setVisibility(0);
            abcr.p.setText((CharSequence)j.toString().toLowerCase(Locale.US));
            return;
        }
        abcr.o.setVisibility(8);
        abcr.p.setVisibility(8);
    }
    
    public final void k() {
        final float l = this.l();
        final abcn a = this.a;
        final int e = this.H.e();
        final float o = ycc.o(l);
        final abcr abcr = (abcr)a;
        if (abcr.r != null) {
            final float n = (float)e;
            final double n2 = l;
            final int round = Math.round(o * n);
            Double.isNaN(n2);
            final double n3 = (double)Math.round(n2 * 10.0);
            final StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("%/");
            sb.append(round);
            sb.append("%(content loudness ");
            Double.isNaN(n3);
            sb.append(n3 / 10.0);
            sb.append(" dB)");
            abcr.r.setText((CharSequence)sb.toString());
        }
    }
    
    public final void td() {
        final tqd b = this.B;
        String string2;
        try {
            final JSONObject jsonObject = new JSONObject();
            for (final Map.Entry<String, V> entry : this.x.b().entrySet()) {
                jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
            }
            final String release = Build$VERSION.RELEASE;
            final String id = Build.ID;
            final String incremental = Build$VERSION.INCREMENTAL;
            final StringBuilder sb = new StringBuilder();
            sb.append(release);
            sb.append(".");
            sb.append(id);
            sb.append(".");
            sb.append(incremental);
            jsonObject.put("cosver", (Object)sb.toString());
            jsonObject.put("videoid", (Object)this.d);
            jsonObject.put("cpn", (Object)this.e);
            jsonObject.put("fmt", (Object)aakt.k(this.h));
            jsonObject.put("afmt", (Object)aakt.k(this.i));
            jsonObject.put("bh", this.o);
            jsonObject.put("conn", this.y.a());
            jsonObject.put("volume", this.H.e());
            final Locale us = Locale.US;
            final float l = this.l();
            int i = 0;
            jsonObject.put("loudness", (Object)String.format(us, "%.3f", l));
            jsonObject.put("bat", (Object)String.format(Locale.US, "%.3f:%d", this.z.a(), this.z.b() ? 1 : 0));
            final Object a = this.c.a();
            final int a2 = ((yon)a).a;
            final int g = this.g;
            final int b2 = ((yon)a).b;
            final int f = this.f;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(a2 - g);
            sb2.append("/");
            sb2.append(b2 - f);
            jsonObject.put("df", (Object)sb2.toString());
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            jsonObject.put("time", (Object)simpleDateFormat.format(new Date()));
            jsonObject.put("glmode", (Object)this.j);
            jsonObject.put("drm", (Object)((yon)a).c);
            jsonObject.put("mtext", (Object)((yon)a).f);
            String string;
            if (this.p.containsKey(this.e)) {
                final ArrayList list = this.p.get(this.e);
                if (list == null) {
                    string = "";
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    while (i < list.size()) {
                        final zbq zbq = (zbq)list.get(i);
                        sb3.append(zbq.m());
                        sb3.append(":");
                        sb3.append(zbq.b());
                        sb3.append(":");
                        sb3.append(zbq.o());
                        sb3.append(",");
                        ++i;
                    }
                    string = sb3.toString();
                }
            }
            else {
                string = "No errors";
            }
            jsonObject.put("error", (Object)string);
            m(jsonObject, this.k);
            m(jsonObject, this.l);
            string2 = jsonObject.toString();
        }
        catch (final JSONException ex) {
            string2 = null;
        }
        final ClipboardManager clipboardManager = (ClipboardManager)this.u.getSystemService("clipboard");
        int n = 2132018770;
        if (string2 != null) {
            n = n;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"YouTube Player Debug Info", (CharSequence)string2));
                n = 2132018771;
            }
        }
        b.c(n);
    }
    
    public final void te(final long n) {
    }
    
    @Override
    public final void update(final Observable observable, final Object o) {
        final zdk a = this.A;
        if (observable == a && this.n) {
            this.a.d((zdj)a.a());
        }
    }
}
