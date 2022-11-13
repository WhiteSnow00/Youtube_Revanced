// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.share.ui;

import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Path$Direction;
import android.view.View;
import java.util.Iterator;
import android.graphics.Path;
import android.graphics.PorterDuff$Mode;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.HashSet;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConversationIconView extends ViewGroup
{
    private final SparseArray a;
    private final SparseArray b;
    private final HashSet c;
    private final Paint d;
    private final Paint e;
    private final int f;
    private int g;
    private int h;
    private int i;
    private Canvas j;
    
    public ConversationIconView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.c = new HashSet();
        this.d = new Paint(1);
        final Paint e = new Paint();
        this.e = e;
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adah.b);
        obtainStyledAttributes.getColor(1, -1);
        obtainStyledAttributes.getColor(0, -1728053248);
        obtainStyledAttributes.getDimensionPixelSize(2, tpe.aZ(displayMetrics, 12));
        this.f = obtainStyledAttributes.getDimensionPixelSize(4, tpe.aZ(displayMetrics, 1));
        final int color = obtainStyledAttributes.getColor(3, -1);
        obtainStyledAttributes.recycle();
        e.setColor(color);
        this.setWillNotDraw(false);
    }
    
    private final int a(final int n, final int n2, final boolean b) {
        final float n3 = (float)this.f;
        int n4 = 1;
        if (b) {
            n4 = -1;
        }
        return Math.round((n + n2) * 0.5f + n3 * 0.5f * n4);
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        this.j.drawColor(0, PorterDuff$Mode.CLEAR);
        super.dispatchDraw(this.j);
        canvas.drawCircle((float)this.g, (float)this.h, (float)this.i, this.d);
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (final int intValue : this.c) {
            if (this.b.get(intValue) != null) {
                canvas.drawPath((Path)this.b.get(intValue), this.e);
            }
        }
    }
    
    protected final void onLayout(final boolean b, int n, int i, int n2, int n3) {
        final int paddingLeft = this.getPaddingLeft();
        n = n2 - n - this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int n4 = n3 - i - this.getPaddingBottom();
        View view;
        int a;
        Path path;
        float n5;
        float n6;
        float n7;
        float n8;
        float n9;
        float n10;
        for (i = 0; i < this.a.size(); ++i) {
            view = (View)this.a.valueAt(i);
            n3 = this.a.keyAt(i);
            if (anb.f((View)this) == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 == 4) {
                                if (n2 != 0) {
                                    n3 = this.a(paddingLeft, n, false);
                                }
                                else {
                                    n3 = paddingLeft;
                                }
                                a = this.a(paddingTop, n4, false);
                                if (n2 != 0) {
                                    n2 = n;
                                }
                                else {
                                    n2 = this.a(paddingLeft, n, true);
                                }
                                view.layout(n3, a, n2, n4);
                            }
                        }
                        else {
                            if (n2 != 0) {
                                n3 = this.a(paddingLeft, n, false);
                            }
                            else {
                                n3 = paddingLeft;
                            }
                            if (n2 != 0) {
                                n2 = n;
                            }
                            else {
                                n2 = this.a(paddingLeft, n, true);
                            }
                            view.layout(n3, paddingTop, n2, this.a(paddingTop, n4, true));
                        }
                    }
                    else {
                        if (n2 != 0) {
                            n3 = paddingLeft;
                        }
                        else {
                            n3 = this.a(paddingLeft, n, false);
                        }
                        if (n2 != 0) {
                            n2 = this.a(paddingLeft, n, true);
                        }
                        else {
                            n2 = n;
                        }
                        view.layout(n3, paddingTop, n2, n4);
                    }
                }
                else {
                    if (n2 != 0) {
                        n3 = this.a(paddingLeft, n, false);
                    }
                    else {
                        n3 = paddingLeft;
                    }
                    if (n2 != 0) {
                        n2 = n;
                    }
                    else {
                        n2 = this.a(paddingLeft, n, true);
                    }
                    view.layout(n3, paddingTop, n2, n4);
                }
            }
            else {
                view.layout(paddingLeft, paddingTop, n, n4);
            }
            n3 = this.b.keyAt(i);
            n2 = anb.f((View)this);
            path = (Path)this.b.get(n3);
            if (n2 == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n3 != 1 && n3 != 2) {
                if (n3 != 3) {
                    if (n3 == 4) {
                        path.addRect((float)this.a(paddingLeft, n, true), (float)this.a(paddingTop, n4, true), (float)this.a(paddingLeft, n, false), (float)n4, Path$Direction.CW);
                        if (n2 != 0) {
                            n5 = (float)this.a(paddingLeft, n, true);
                        }
                        else {
                            n5 = (float)paddingLeft;
                        }
                        n6 = (float)this.a(paddingTop, n4, true);
                        if (n2 != 0) {
                            n7 = (float)n;
                        }
                        else {
                            n7 = (float)this.a(paddingLeft, n, false);
                        }
                        path.addRect(n5, n6, n7, (float)this.a(paddingTop, n4, false), Path$Direction.CW);
                    }
                }
                else {
                    path.addRect((float)this.a(paddingLeft, n, true), (float)paddingTop, (float)this.a(paddingLeft, n, false), (float)this.a(paddingTop, n4, false), Path$Direction.CW);
                    if (n2 != 0) {
                        n8 = (float)this.a(paddingLeft, n, true);
                    }
                    else {
                        n8 = (float)paddingLeft;
                    }
                    n9 = (float)this.a(paddingTop, n4, true);
                    if (n2 != 0) {
                        n10 = (float)n;
                    }
                    else {
                        n10 = (float)this.a(paddingLeft, n, false);
                    }
                    path.addRect(n8, n9, n10, (float)this.a(paddingTop, n4, false), Path$Direction.CW);
                }
            }
            else {
                path.addRect((float)this.a(paddingLeft, n, true), (float)paddingTop, (float)this.a(paddingLeft, n, false), (float)n4, Path$Direction.CW);
            }
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        for (int i = 0; i < this.a.size(); ++i) {
            final View view = (View)this.a.valueAt(i);
            final int key = this.a.keyAt(i);
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            int a;
            if (key == 0) {
                a = measuredWidth;
            }
            else {
                a = this.a(0, measuredWidth, true);
            }
            layoutParams.width = a;
            int a2;
            if (key != 0 && key != 1 && key != 2) {
                a2 = this.a(0, measuredHeight, true);
            }
            else {
                a2 = measuredHeight;
            }
            layoutParams.height = a2;
        }
        this.measureChildren(n, n2);
    }
    
    protected final void onSizeChanged(final int n, final int n2, int h, int g) {
        super.onSizeChanged(n, n2, h, g);
        g = n / 2;
        this.g = g;
        h = n2 / 2;
        this.h = h;
        this.i = Math.min(g, h);
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        this.j = new Canvas(bitmap);
        this.d.setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
    }
}
