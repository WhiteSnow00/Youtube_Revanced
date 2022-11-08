import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import android.content.Context;
import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpa
{
    final int A;
    final int B;
    final int C;
    final Paint a;
    final Paint b;
    final Paint c;
    final Paint d;
    final Paint e;
    final Paint f;
    final Paint g;
    final Paint h;
    final Paint i;
    final Paint j;
    final Paint k;
    final int l;
    final Paint m;
    final int n;
    final int o;
    final int p;
    final int q;
    final Paint r;
    final int s;
    final int t;
    final int u;
    final int v;
    final int w;
    final int x;
    final grw y;
    final int z;
    
    public fpa(final Context context) {
        final Resources resources = context.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.h = new Paint(1);
        final Paint i = new Paint(1);
        this.i = i;
        final Paint j = new Paint(1);
        this.j = j;
        (this.k = new Paint(1)).setColor(resources.getColor(2131100941));
        this.u = resources.getDimensionPixelSize(2131166957);
        this.v = resources.getDimensionPixelSize(2131166959);
        this.w = resources.getDimensionPixelSize(2131166958);
        this.l = tmy.aZ(displayMetrics, 4);
        (this.m = new Paint()).setColor(resources.getColor(2131100932));
        this.n = resources.getDimensionPixelSize(2131170136);
        this.q = resources.getDimensionPixelSize(2131170133);
        this.o = resources.getDimensionPixelSize(2131170135);
        this.p = resources.getDimensionPixelSize(2131170132);
        final int color = resources.getColor(2131099691);
        this.s = color;
        this.t = resources.getColor(2131101559);
        (this.r = new Paint(1)).setColor(color);
        this.z = tmy.aZ(displayMetrics, 3);
        this.A = resources.getDimensionPixelSize(2131166956);
        this.B = resources.getDimensionPixelSize(2131166963);
        this.y = new grw(resources);
        this.x = resources.getDimensionPixelSize(2131166860);
        this.C = resources.getDimensionPixelSize(2131166960);
        i.setStyle(Paint$Style.FILL);
        j.setStyle(Paint$Style.STROKE);
        j.setColor(-16777216);
        j.setStrokeWidth(0.5f);
    }
}
