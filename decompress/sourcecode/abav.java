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

public final class abav implements Observer, yzp, abar, abaw
{
    private final zbr A;
    private final tny B;
    private final abns C;
    private int D;
    private long E;
    private final asib F;
    private ibc G;
    private final trg H;
    public final abas a;
    public final aeyr b;
    public final aeyr c;
    public String d;
    public String e;
    public int f;
    public int g;
    public FormatStreamModel h;
    public FormatStreamModel i;
    public vhj j;
    public aliq[] k;
    public aliq[] l;
    public final abau m;
    public boolean n;
    public long o;
    public final HashMap p;
    public float q;
    public boolean r;
    public final ibc s;
    public final wod t;
    private final Context u;
    private final aexq v;
    private final yzo w;
    private final zgv x;
    private final thh y;
    private final tqy z;
    
    public abav(final abas a, final Context u, final aexq v, final yzo w, final zgv x, final thh y, final tqy z, final zbr a2, final aeyr b, final aeyr c, final tny b2, final abns c2, final trg h, final byte[] array) {
        a.getClass();
        this.a = a;
        ((abax)a).C = (abar)this;
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
        this.m = new abau(this);
        this.t = new wod(this, 10);
        this.s = new ibc(this, 13);
        this.F = new asib();
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
    
    private static void m(final JSONObject jsonObject, final aliq[] array) {
        if (array == null) {
            return;
        }
        for (final aliq aliq : array) {
            final String e = aliq.e;
            if (e.startsWith("innertube.build.") || e.equals("e") || e.equals("logged_in")) {
                final String e2 = aliq.e;
                String s;
                if (aliq.c == 2) {
                    s = (String)aliq.d;
                }
                else {
                    s = "";
                }
                jsonObject.put(e2, (Object)s);
            }
        }
    }
    
    public final void a(final zae zae) {
        synchronized (this) {
            this.D += zae.b;
            this.E += zae.c;
            this.r = zae.d;
        }
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
                this.G = new ibc(this, 14);
            }
            this.n = true;
            final abas a = this.a;
            final abax abax = (abax)a;
            if (abax.e == null) {
                LayoutInflater.from(abax.getContext()).inflate(2131624328, (ViewGroup)a);
                abax.e = abax.findViewById(2131430039);
                (abax.f = abax.findViewById(2131428701)).setOnClickListener((View$OnClickListener)a);
                abax.f.setVisibility(0);
                (abax.g = abax.findViewById(2131428489)).setOnClickListener((View$OnClickListener)a);
                abax.g.setVisibility(0);
                abax.h = (TextView)abax.findViewById(2131428655);
                abax.i = (TextView)abax.findViewById(2131432311);
                abax.j = (TextView)abax.findViewById(2131428508);
                abax.l = (TextView)abax.findViewById(2131430463);
                abax.m = (TextView)abax.findViewById(2131430428);
                abax.n = (TextView)abax.findViewById(2131432307);
                abax.q = (TextView)abax.findViewById(2131427655);
                abax.r = (TextView)abax.findViewById(2131432402);
                abax.s = (TextView)abax.findViewById(2131427778);
                abax.t = (ImageView)abax.findViewById(2131427779);
                abax.u = (TextView)abax.findViewById(2131430783);
                abax.v = (ImageView)abax.findViewById(2131430784);
                abax.w = (TextView)abax.findViewById(2131432376);
                abax.x = (TextView)abax.findViewById(2131428765);
                abax.y = (TextView)abax.findViewById(2131427798);
                abax.z = (TextView)abax.findViewById(2131427797);
                abax.k = (TextView)abax.findViewById(2131430005);
                abax.A = abax.findViewById(2131429493);
                abax.B = (TextView)abax.findViewById(2131429492);
                abax.o = abax.findViewById(2131432310);
                abax.p = (TextView)abax.findViewById(2131432309);
                abax.E = (TextView)abax.findViewById(2131428435);
                abax.D = abax.findViewById(2131428436);
                abax.A.measure(0, 0);
                final int az = tmy.aZ(abax.getResources().getDisplayMetrics(), 100);
                final int n = abax.A.getMeasuredHeight() - 1;
                abax.F = new uey(az, n, abax.a, abax.b);
                abax.G = new uey(az, n, abax.c, abax.d);
                abax.y.setVisibility(8);
                abax.z.setVisibility(8);
            }
            abax.e.setVisibility(0);
            final abas a2 = this.a;
            final String manufacturer = Build.MANUFACTURER;
            final String model = Build.MODEL;
            final String release = Build$VERSION.RELEASE;
            final StringBuilder sb = new StringBuilder();
            sb.append(manufacturer);
            sb.append(" ");
            sb.append(model);
            sb.append(" ");
            sb.append(release);
            ((abax)a2).h.setText((CharSequence)sb.toString());
            this.a.c(this.h);
            this.a.b(this.i);
            this.k();
            this.a.d((zbq)this.A.a());
            this.j();
            this.i();
            this.F.f(this.G.lX(this.C));
            this.F.c(((tku)((aexw)this.v).a).d().R().P(ashw.a()).q((asjc)aaza.d).al((asix)new abat(this, 0)));
            this.w.d((yzp)this);
            this.A.addObserver((Observer)this);
            return;
        }
        this.h();
    }
    
    public final void h() {
        if (this.n) {
            this.n = false;
            final View e = ((abax)this.a).e;
            if (e != null) {
                e.setVisibility(8);
            }
            this.F.b();
            this.w.e((yzp)this);
            this.A.deleteObserver((Observer)this);
        }
    }
    
    public final void i() {
        final Object a = this.c.a();
        final abas a2 = this.a;
        final ymp ymp = (ymp)a;
        ((abax)a2).k.setText((CharSequence)tsx.i(ymp.f));
        final abas a3 = this.a;
        final String i = tsx.i(ymp.c);
        final abax abax = (abax)a3;
        if (abax.E != null) {
            if (abax.D != null) {
                if (i.isEmpty()) {
                    abax.E.setVisibility(8);
                    abax.D.setVisibility(8);
                }
                else {
                    abax.E.setVisibility(0);
                    abax.D.setVisibility(0);
                    abax.E.setText((CharSequence)i);
                }
            }
        }
        ((abax)this.a).l.setText((CharSequence)abax.e(tsx.i(ymp.d)));
        ((abax)this.a).m.setText((CharSequence)abax.e(tsx.i(ymp.e)));
    }
    
    public final void j() {
        ((abax)this.a).j.setText((CharSequence)this.e);
        ((abax)this.a).i.setText((CharSequence)this.d);
        final abas a = this.a;
        final vhj j = this.j;
        final abax abax = (abax)a;
        if (abax.p == null) {
            return;
        }
        if (j != null && j != vhj.e && j != vhj.a) {
            abax.o.setVisibility(0);
            abax.p.setVisibility(0);
            abax.p.setText((CharSequence)j.toString().toLowerCase(Locale.US));
            return;
        }
        abax.o.setVisibility(8);
        abax.p.setVisibility(8);
    }
    
    public final void k() {
        final float l = this.l();
        final abas a = this.a;
        final int e = this.H.e();
        final float q = yah.q(l);
        final abax abax = (abax)a;
        if (abax.r != null) {
            final int round = Math.round(q * e);
            final double n = l;
            Double.isNaN(n);
            final long round2 = Math.round(n * 10.0);
            final StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("%/");
            sb.append(round);
            sb.append("%(content loudness ");
            final double n2 = (double)round2;
            Double.isNaN(n2);
            sb.append(n2 / 10.0);
            sb.append(" dB)");
            abax.r.setText((CharSequence)sb.toString());
        }
    }
    
    public final void sX() {
        final tny b = this.B;
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
            jsonObject.put("fmt", (Object)aaiy.k(this.h));
            jsonObject.put("afmt", (Object)aaiy.k(this.i));
            jsonObject.put("bh", this.o);
            jsonObject.put("conn", this.y.a());
            jsonObject.put("volume", this.H.e());
            final Locale us = Locale.US;
            final float l = this.l();
            int i = 0;
            jsonObject.put("loudness", (Object)String.format(us, "%.3f", l));
            jsonObject.put("bat", (Object)String.format(Locale.US, "%.3f:%d", this.z.a(), this.z.b() ? 1 : 0));
            final Object a = this.c.a();
            final int a2 = ((ymp)a).a;
            final int g = this.g;
            final int b2 = ((ymp)a).b;
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
            jsonObject.put("drm", (Object)((ymp)a).c);
            jsonObject.put("mtext", (Object)((ymp)a).f);
            String string;
            if (this.p.containsKey(this.e)) {
                final ArrayList list = this.p.get(this.e);
                if (list == null) {
                    string = "";
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    while (i < list.size()) {
                        final yzx yzx = (yzx)list.get(i);
                        sb3.append(yzx.m());
                        sb3.append(":");
                        sb3.append(yzx.b());
                        sb3.append(":");
                        sb3.append(yzx.o());
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
        int n = 2132018769;
        if (string2 != null) {
            n = n;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"YouTube Player Debug Info", (CharSequence)string2));
                n = 2132018770;
            }
        }
        b.c(n);
    }
    
    @Override
    public final void update(final Observable observable, final Object o) {
        final zbr a = this.A;
        if (observable == a && this.n) {
            this.a.d((zbq)a.a());
        }
    }
}
