import java.util.ArrayList;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmz
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public abmz(final Context context, final atke atke, final abul abul, final int n, final atke atke2) {
        this(context, atke, abul, n, atke2, abmv.a);
    }
    
    public abmz(final Context c, final atke d, final abul b, final int a, final atke e, final abmv f) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
        e.getClass();
        this.e = e;
        this.f = f;
    }
    
    public abmz(final int[] b, final bpe[] e, final int[] f, final int[][][] d, final bpe c) {
        this.b = b;
        this.e = e;
        this.d = d;
        this.f = f;
        this.c = c;
        this.a = b.length;
    }
    
    public final PendingIntent a(final String action) {
        return PendingIntent.getBroadcast((Context)this.c, 0, new Intent().setPackage(((Context)this.c).getPackageName()).setAction(action), 201326592);
    }
    
    public final void b(final afq afq, final int n, final int n2, final PendingIntent pendingIntent, final List list, final boolean b) {
        final CharSequence text = ((Context)this.c).getText(n2);
        IconCompat e;
        if (n == 0) {
            e = null;
        }
        else {
            e = IconCompat.e(n);
        }
        afq.e(sz.c(e, afq.c(text), pendingIntent, new Bundle(), (ArrayList)null));
        if (b) {
            list.add(afq.b.size() - 1);
        }
    }
    
    public final int c(final int n) {
        return ((int[])this.b)[n];
    }
    
    public final int d(final int n, final int n2, final int n3) {
        return ber.f(((int[][][])this.d)[n][n2][n3]);
    }
    
    public final int e(final int n) {
        int i = 0;
        int n2 = 0;
        while (i < this.a) {
            int max = n2;
            if (((int[])this.b)[i] == n) {
                final int[][] array = ((int[][][])this.d)[i];
                final int length = array.length;
                int n3 = 0;
                int max2 = 0;
                int n4 = 0;
            Label_0174:
                while (true) {
                    n4 = max2;
                    if (n3 >= length) {
                        break;
                    }
                    final int[] array2 = array[n3];
                    for (int length2 = array2.length, j = 0; j < length2; ++j) {
                        final int f = ber.f(array2[j]);
                        int n6;
                        final int n5 = n6 = 1;
                        if (f != 0) {
                            n6 = n5;
                            if (f != 1) {
                                n6 = n5;
                                if (f != 2) {
                                    if (f != 3) {
                                        if (f == 4) {
                                            n4 = 3;
                                            break Label_0174;
                                        }
                                        throw new IllegalStateException();
                                    }
                                    else {
                                        n6 = 2;
                                    }
                                }
                            }
                        }
                        max2 = Math.max(max2, n6);
                    }
                    ++n3;
                }
                max = Math.max(n2, n4);
            }
            ++i;
            n2 = max;
        }
        return n2;
    }
    
    public final bpe f(final int n) {
        return ((bpe[])this.e)[n];
    }
}
