// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.image;

import android.content.ContentResolver;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.view.MenuItem;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.Menu;
import android.graphics.Bitmap;
import android.content.Intent;
import java.io.FileNotFoundException;
import android.os.Looper;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.os.Handler;
import android.graphics.Rect;
import android.util.Pair;
import android.net.Uri;
import android.graphics.PointF;
import android.graphics.Matrix;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.view.View$OnLayoutChangeListener;
import android.view.View$OnTouchListener;

public class CropActivity extends ris implements View$OnTouchListener, View$OnLayoutChangeListener
{
    private FrameLayout A;
    private LinearLayout B;
    private View C;
    private TextView D;
    private FrameLayout E;
    private FrameLayout F;
    private TextView G;
    private View H;
    private Matrix I;
    private final PointF J;
    private final PointF K;
    private double L;
    private final float[] M;
    private boolean N;
    private boolean O;
    private int P;
    private Uri b;
    private Uri c;
    private CharSequence d;
    private int e;
    private int f;
    private int g;
    private int h;
    private CharSequence i;
    private int j;
    private int k;
    private int l;
    private int m;
    private CharSequence n;
    private int o;
    private CharSequence p;
    private Pair q;
    private int r;
    private int s;
    private Matrix t;
    private Rect u;
    private Handler v;
    private ImageView w;
    private LinearLayout x;
    private LinearLayout y;
    private TextView z;
    
    public CropActivity() {
        this.J = new PointF();
        this.K = new PointF();
        this.L = 1.0;
        this.M = new float[9];
        this.N = true;
        this.O = true;
    }
    
    private static double b(final MotionEvent motionEvent) {
        return Math.hypot(motionEvent.getX(0) - motionEvent.getX(1), motionEvent.getY(0) - motionEvent.getY(1));
    }
    
    private final Rect d() {
        this.t.getValues(this.M);
        final int n = (int)Math.ceil(this.M[2]);
        final int n2 = (int)Math.ceil(this.M[5]);
        final float[] m = this.M;
        final int n3 = (int)Math.floor(m[0] * this.r + m[3] * this.s);
        final float[] i = this.M;
        final Rect rect = new Rect(n, n2, n3 + n, (int)Math.floor(i[4] * this.s + i[1] * this.r) + n2);
        rect.sort();
        return rect;
    }
    
    private final Rect e() {
        final Rect rect = new Rect(this.u);
        final Rect d = this.d();
        rect.offset(-d.left, -d.top);
        final double n = (int)this.q.first;
        final double n2 = d.width();
        final double n3 = rect.left;
        final double n4 = rect.top;
        final double n5 = rect.width();
        Double.isNaN(n);
        Double.isNaN(n2);
        final double n6 = n / n2;
        Double.isNaN(n5);
        final int max = Math.max(1, (int)(n5 * n6));
        final double n7 = rect.height();
        Double.isNaN(n3);
        final int n8 = (int)(n3 * n6);
        Double.isNaN(n7);
        final int n9 = (int)(n7 * n6);
        Double.isNaN(n4);
        final int n10 = (int)(n4 * n6);
        rect.set(n8, n10, max + n8, Math.max(1, n9) + n10);
        return rect;
    }
    
    private final void f() {
        final Rect d = this.d();
        final int g = this.g;
        final int n = 0;
        Rect d2 = null;
        Label_0174: {
            if (g <= 0) {
                d2 = d;
                if (this.h <= 0) {
                    break Label_0174;
                }
            }
            final Rect e = this.e();
            double n4;
            if (this.g >= e.width()) {
                final double n2 = this.g;
                final double n3 = e.width();
                this.O = false;
                Double.isNaN(n2);
                Double.isNaN(n3);
                n4 = n2 / n3;
            }
            else {
                n4 = 1.0;
            }
            double min = n4;
            if (this.h >= e.height()) {
                final double n5 = this.h;
                final double n6 = e.height();
                Double.isNaN(n5);
                Double.isNaN(n6);
                min = Math.min(n4, n5 / n6);
                this.O = false;
            }
            d2 = d;
            if (min < 1.0) {
                d2 = d;
                if (this.N) {
                    k(this.t, min);
                    d2 = this.d();
                }
            }
        }
        double n9;
        if (this.u.width() >= d2.width()) {
            final double n7 = this.u.width();
            final double n8 = d2.width();
            this.N = true;
            Double.isNaN(n7);
            Double.isNaN(n8);
            n9 = n7 / n8;
        }
        else {
            n9 = 1.0;
        }
        double max = n9;
        if (this.u.height() >= d2.height()) {
            final double n10 = this.u.height();
            final double n11 = d2.height();
            Double.isNaN(n10);
            Double.isNaN(n11);
            max = Math.max(n9, n10 / n11);
            this.N = true;
        }
        Rect d3 = d2;
        if (max > 1.0) {
            d3 = d2;
            if (this.O) {
                k(this.t, max);
                d3 = this.d();
            }
        }
        if (!d3.contains(this.u)) {
            int n14 = 0;
            Label_0413: {
                int n12;
                int n13;
                if (this.u.left < d3.left) {
                    n12 = this.u.left;
                    n13 = d3.left;
                }
                else {
                    if (this.u.right <= d3.right) {
                        n14 = 0;
                        break Label_0413;
                    }
                    n12 = this.u.right;
                    n13 = d3.right;
                }
                n14 = n12 - n13;
            }
            int n17 = 0;
            Label_0491: {
                int n15;
                int n16;
                if (this.u.top < d3.top) {
                    n15 = this.u.top;
                    n16 = d3.top;
                }
                else {
                    if (this.u.bottom <= d3.bottom) {
                        n17 = 0;
                        break Label_0491;
                    }
                    n15 = this.u.bottom;
                    n16 = d3.bottom;
                }
                n17 = n15 - n16;
            }
            if (n14 == 0) {
                if (n17 == 0) {
                    return;
                }
                n14 = n;
            }
            this.t.postTranslate((float)n14, (float)n17);
        }
    }
    
    private final void g(final View view, final tut tut, final Class clazz) {
        this.v.post((Runnable)new rib(view, tut, clazz, 3));
    }
    
    private static void h(final Object o) {
        o.getClass();
    }
    
    private static final Rect i(double n, Rect rect) {
        final double n2 = rect.width();
        Double.isNaN(n2);
        n = n2 / n * 0.5;
        rect = new Rect(rect.left, rect.centerY() - (int)Math.round(n), rect.right, rect.centerY() + (int)Math.round(n));
        rect.sort();
        return rect;
    }
    
    private static final Rect j(double n, Rect rect) {
        final double n2 = rect.height();
        Double.isNaN(n2);
        n = n2 * n * 0.5;
        rect = new Rect(rect.centerX() - (int)Math.round(n), rect.top, rect.centerX() + (int)Math.round(n), rect.bottom);
        rect.sort();
        return rect;
    }
    
    private static final void k(final Matrix matrix, final double n) {
        final float n2 = (float)n;
        matrix.postScale(n2, n2);
    }
    
    public final void onCreate(Bundle extras) {
        super.onCreate(extras);
        ((qt)this).setContentView(2131623991);
        this.v = new Handler(Looper.getMainLooper());
        this.t = new Matrix();
        this.I = new Matrix();
        this.P = 0;
        final Intent intent = this.getIntent();
        if (intent != null && intent.getExtras() != null) {
            this.c = intent.getData();
            extras = intent.getExtras();
            this.b = (Uri)extras.getParcelable("output");
            this.d = extras.getCharSequence("cropLabel");
            this.e = extras.getInt("widthRatio", 0);
            this.f = extras.getInt("heightRatio", 0);
            this.g = extras.getInt("minWidth", 0);
            this.h = extras.getInt("minHeight", 0);
            this.i = extras.getCharSequence("visualCropLabel");
            this.l = extras.getInt("visualWidthRatio", this.e);
            this.m = extras.getInt("visualHeightRatio", this.f);
            this.n = extras.getCharSequence("visualDoubleCropLabel");
            this.o = extras.getInt("visualDoubleWidthRatio", this.l);
            this.j = extras.getInt("minOutputWidth", 0);
            this.k = extras.getInt("minOutputHeight", 0);
            this.p = extras.getCharSequence("cropInfo");
            if (this.e > 0 && this.f > 0) {
                if (this.l < this.o) {
                    ttr.b("A double mask width ratio must be smaller or equal to a single mask width ratio");
                    this.setResult(1);
                    this.finish();
                }
                else {
                    try {
                        final Pair w = aald.W(this.getContentResolver(), this.c);
                        this.q = w;
                        if (this.g > (int)w.first || this.h > (int)this.q.second) {
                            final int g = this.g;
                            final int h = this.h;
                            final StringBuilder sb = new StringBuilder("Selected image is too small. Must be at least ");
                            sb.append(g);
                            sb.append("x");
                            sb.append(h);
                            ttr.b(sb.toString());
                            this.setResult(2);
                            this.finish();
                        }
                    }
                    catch (final FileNotFoundException ex) {
                        ttr.d("Image file not found", (Throwable)ex);
                        this.setResult(1);
                        this.finish();
                    }
                }
            }
            else {
                ttr.b("Width and height ratio must be positive");
                this.setResult(1);
                this.finish();
            }
        }
        else {
            ttr.b("Input for CropActivity is missing");
            this.setResult(1);
            this.finish();
        }
        if (!this.isFinishing()) {
            final ImageView w2 = (ImageView)((fa)this).findViewById(2131429296);
            h(w2);
            this.w = w2;
            final TextView z = (TextView)((fa)this).findViewById(2131432209);
            h(z);
            this.z = z;
            final LinearLayout x = (LinearLayout)((fa)this).findViewById(2131427633);
            h(x);
            this.x = x;
            final LinearLayout y = (LinearLayout)((fa)this).findViewById(2131432208);
            h(y);
            this.y = y;
            final FrameLayout a = (FrameLayout)((fa)this).findViewById(2131432145);
            h(a);
            this.A = a;
            final LinearLayout b = (LinearLayout)((fa)this).findViewById(2131428640);
            h(b);
            this.B = b;
            final View viewById = ((fa)this).findViewById(2131427839);
            h(viewById);
            this.C = viewById;
            final TextView d = (TextView)((fa)this).findViewById(2131428641);
            h(d);
            this.D = d;
            final FrameLayout e = (FrameLayout)((fa)this).findViewById(2131429520);
            h(e);
            this.E = e;
            final FrameLayout f = (FrameLayout)((fa)this).findViewById(2131429887);
            h(f);
            this.F = f;
            final TextView g2 = (TextView)((fa)this).findViewById(2131429888);
            h(g2);
            this.G = g2;
            this.H = ((fa)this).findViewById(2131431206);
            try {
                final Bitmap x2 = aald.X(this.getContentResolver(), this.c);
                this.r = x2.getWidth();
                this.s = x2.getHeight();
                this.w.setImageBitmap(x2);
                this.w.setOnTouchListener((View$OnTouchListener)this);
                this.w.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                final CharSequence p = this.p;
                if (p != null && p.length() > 0) {
                    final TextView textView = (TextView)((fa)this).findViewById(2131428542);
                    h(textView);
                    textView.setText(this.p);
                    final FrameLayout frameLayout = (FrameLayout)((fa)this).findViewById(2131428543);
                    h(frameLayout);
                    tpe.v((View)frameLayout, true);
                }
            }
            catch (final FileNotFoundException ex2) {
                ttr.d("Image file not found", (Throwable)ex2);
                this.setResult(1);
                this.finish();
            }
            if (this.isFinishing()) {
                return;
            }
            final ep supportActionBar = ((fa)this).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.C();
                supportActionBar.j(true);
                supportActionBar.l(false);
                supportActionBar.z();
            }
        }
    }
    
    public final boolean onCreateOptionsMenu(final Menu menu) {
        ((fa)this).getMenuInflater().inflate(2131755010, menu);
        return true;
    }
    
    public final void onLayoutChange(final View view, int n, int n2, int n3, final int n4, int n5, final int n6, final int n7, final int n8) {
        n5 = (int)((fa)this).getResources().getDimension(2131166228) / 2;
        final Rect rect = new Rect(n + n5, n2 + n5, n3 - n5, n4 - n5);
        rect.sort();
        n3 = this.e;
        n = 1;
        if (n3 > 0) {
            n2 = this.f;
            if (n2 > 0) {
                final double n9 = n2;
                final double n10 = n3;
                Double.isNaN(n10);
                Double.isNaN(n9);
                final double n11 = n10 / n9;
                Rect u;
                if ((u = i(n11, rect)).height() > rect.height()) {
                    u = j(n11, rect);
                }
                this.u = u;
                this.g((View)this.x, tpe.at(u.height()), ViewGroup$LayoutParams.class);
                this.g((View)this.y, tpe.aD(this.u.width()), ViewGroup$LayoutParams.class);
                final CharSequence d = this.d;
                if (d != null && d.length() > 0) {
                    this.z.setText(this.d);
                }
                n3 = this.l;
                if (n3 > 0) {
                    n2 = this.m;
                    if (n2 > 0) {
                        final Rect u2 = this.u;
                        final double n12 = n2;
                        final double n13 = n3;
                        Double.isNaN(n13);
                        Double.isNaN(n12);
                        final Rect i = i(n13 / n12, u2);
                        n2 = (this.u.height() - i.height()) / 2;
                        this.g((View)this.A, tpe.at(n2), ViewGroup$LayoutParams.class);
                        this.g((View)this.B, tpe.at(i.height()), ViewGroup$LayoutParams.class);
                        this.g(this.C, tpe.at(n2), ViewGroup$LayoutParams.class);
                        tpe.v((View)this.A, true);
                        tpe.v(this.C, true);
                        final CharSequence j = this.i;
                        if (j != null && j.length() > 0) {
                            this.D.setText(this.i);
                            tpe.v((View)this.D, true);
                        }
                        n2 = this.o;
                        if (n2 > 0.0f) {
                            final double n14 = n2;
                            final double n15 = this.m;
                            Double.isNaN(n14);
                            Double.isNaN(n15);
                            final Rect k = j(n14 / n15, i);
                            n2 = (i.width() - k.width()) / 2;
                            this.g((View)this.E, tpe.aD(n2), ViewGroup$LayoutParams.class);
                            this.g((View)this.F, tpe.aD(k.width()), ViewGroup$LayoutParams.class);
                            this.g(this.H, tpe.aD(n2), ViewGroup$LayoutParams.class);
                            tpe.v((View)this.E, true);
                            tpe.v(this.H, true);
                            tpe.v((View)this.F, true);
                            final CharSequence n16 = this.n;
                            if (n16 != null && n16.length() > 0) {
                                this.G.setText(this.n);
                                tpe.v((View)this.G, true);
                            }
                        }
                    }
                }
            }
        }
        final FrameLayout frameLayout = (FrameLayout)((fa)this).findViewById(2131428543);
        h(frameLayout);
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)frameLayout.getLayoutParams();
        if (((fa)this).getResources().getConfiguration().orientation != 2) {
            n = 0;
        }
        float n17;
        if (n != 0) {
            n17 = ((fa)this).getResources().getDimension(2131166226);
        }
        else {
            n17 = ((fa)this).getResources().getDimension(2131166227);
        }
        n2 = (int)n17;
        float n18;
        if (n != 0) {
            n18 = ((fa)this).getResources().getDimension(2131166223);
        }
        else {
            n18 = ((fa)this).getResources().getDimension(2131166224);
        }
        viewGroup$MarginLayoutParams.setMargins(n2, 0, n2, (int)n18);
        this.f();
        this.w.setImageMatrix(this.t);
    }
    
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131428545) {
            final Rect e = this.e();
            final int width = e.width();
            final int height = e.height();
            int intValue = 0;
            int n = 0;
            Label_0217: {
                if (width <= (int)this.q.first && height <= (int)this.q.second) {
                    final int g = this.g;
                    intValue = width;
                    n = height;
                    if (g > 0) {
                        intValue = width;
                        n = height;
                        if (this.h > 0) {
                            final double n2 = width - g;
                            final double n3 = g;
                            Double.isNaN(n2);
                            Double.isNaN(n3);
                            final double abs = Math.abs(n2 / n3);
                            final int g2 = this.g;
                            if (g2 <= width && this.h <= height) {
                                intValue = width;
                                n = height;
                                if (abs > 0.019999999552965164) {
                                    break Label_0217;
                                }
                            }
                            n = this.h;
                            intValue = g2;
                        }
                    }
                }
                else {
                    intValue = (int)this.q.first;
                    n = (int)this.q.second;
                }
            }
            final int min = Math.min(n, Math.min(intValue, this.e * n / this.f) * this.f / this.e);
            e.set(e.left, e.top, e.left + this.e * min / this.f, e.top + min);
            int n4;
            if (e.left < 0) {
                n4 = -e.left;
            }
            else if (e.right > (int)this.q.first) {
                n4 = (int)this.q.first - e.right;
            }
            else {
                n4 = 0;
            }
            int n5;
            if (e.top < 0) {
                n5 = -e.top;
            }
            else if (e.bottom > (int)this.q.second) {
                n5 = (int)this.q.second - e.bottom;
            }
            else {
                n5 = 0;
            }
            e.offset(n4, n5);
            Object u;
            final Object o = u = null;
            try {
                Label_0789: {
                    try {
                        final ContentResolver contentResolver = this.getContentResolver();
                        u = o;
                        final Uri c = this.c;
                        u = o;
                        int n6;
                        if ((n6 = this.j) <= 0) {
                            u = o;
                            n6 = this.g;
                        }
                        u = o;
                        int n7;
                        if ((n7 = this.k) <= 0) {
                            u = o;
                            n7 = this.h;
                        }
                        u = o;
                        final Bitmap bitmap = (Bitmap)(u = aald.U(contentResolver, c, e, n6, n7));
                        Bitmap scaledBitmap = null;
                        Label_0628: {
                            if (this.j <= bitmap.getWidth()) {
                                scaledBitmap = bitmap;
                                u = bitmap;
                                if (this.k <= bitmap.getHeight()) {
                                    break Label_0628;
                                }
                            }
                            u = bitmap;
                            scaledBitmap = Bitmap.createScaledBitmap(bitmap, this.j, this.k, true);
                        }
                        u = scaledBitmap;
                        final Bitmap$CompressFormat jpeg = Bitmap$CompressFormat.JPEG;
                        u = scaledBitmap;
                        u = scaledBitmap;
                        final FileOutputStream fileOutputStream = new FileOutputStream(this.b.getPath());
                        u = scaledBitmap;
                        scaledBitmap.compress(jpeg, 90, (OutputStream)fileOutputStream);
                        u = scaledBitmap;
                        u = scaledBitmap;
                        final Intent intent = new Intent();
                        u = scaledBitmap;
                        intent.setData(this.b);
                        u = scaledBitmap;
                        this.setResult(-1, intent);
                        if (scaledBitmap != null) {
                            menuItem = (MenuItem)scaledBitmap;
                            break Label_0789;
                        }
                        break Label_0789;
                    }
                    finally {
                        if (u != null) {
                            ((Bitmap)u).recycle();
                        }
                        this.finish();
                        ((Bitmap)menuItem).recycle();
                        this.finish();
                        return true;
                    }
                }
            }
            catch (final IOException ex) {}
        }
        if (menuItem.getItemId() == 16908332) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final ImageView imageView = (ImageView)view;
        final int n = motionEvent.getAction() & 0xFF;
        Label_0368: {
            if (n != 0) {
                if (n != 1) {
                    if (n == 2) {
                        final int p2 = this.P;
                        if (p2 == 1) {
                            this.t.set(this.I);
                            this.t.postTranslate(motionEvent.getX() - this.J.x, motionEvent.getY() - this.J.y);
                        }
                        else if (p2 == 2) {
                            final double b = b(motionEvent);
                            if (b > 10.0) {
                                final double n2 = b / this.L;
                                if ((n2 < 1.0 && this.N) || (n2 > 1.0 && this.O)) {
                                    this.t.set(this.I);
                                    final Matrix t = this.t;
                                    final float x = this.K.x;
                                    final float y = this.K.y;
                                    final float n3 = (float)n2;
                                    t.postScale(n3, n3, x, y);
                                    if (n2 < 1.0) {
                                        this.O = true;
                                    }
                                    else {
                                        this.N = true;
                                    }
                                }
                            }
                        }
                        this.f();
                        break Label_0368;
                    }
                    if (n != 5) {
                        if (n != 6) {
                            break Label_0368;
                        }
                    }
                    else {
                        final double b2 = b(motionEvent);
                        this.L = b2;
                        if (b2 > 10.0) {
                            this.I.set(this.t);
                            this.K.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
                            this.P = 2;
                        }
                        break Label_0368;
                    }
                }
                this.P = 0;
                view.performClick();
            }
            else {
                this.I.set(this.t);
                this.J.set(motionEvent.getX(), motionEvent.getY());
                this.P = 1;
            }
        }
        imageView.setImageMatrix(this.t);
        return true;
    }
}
