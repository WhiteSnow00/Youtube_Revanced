import android.graphics.Canvas;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.ViewGroup$LayoutParams;
import java.util.Arrays;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.AttributeSet;
import java.util.HashMap;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class adq extends View
{
    public int[] c;
    public int d;
    protected final Context e;
    public String f;
    protected String g;
    public final HashMap h;
    public acx i;
    
    public adq(final Context e) {
        super(e);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = e;
        this.a(null);
    }
    
    public adq(final Context e, final AttributeSet set) {
        super(e, set);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = e;
        this.a(set);
    }
    
    public adq(final Context e, final AttributeSet set, final int n) {
        super(e, set, n);
        this.c = new int[32];
        this.h = new HashMap();
        this.e = e;
        this.a(set);
    }
    
    private final void c(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (this.e == null) {
                    return;
                }
                final String trim = s.trim();
                ConstraintLayout constraintLayout;
                if (this.getParent() instanceof ConstraintLayout) {
                    constraintLayout = (ConstraintLayout)this.getParent();
                }
                else {
                    constraintLayout = null;
                }
                final boolean inEditMode = this.isInEditMode();
                final int n = 0;
                int intValue = 0;
                Label_0099: {
                    if (inEditMode && constraintLayout != null) {
                        final Object re = constraintLayout.rE(trim);
                        if (re instanceof Integer) {
                            intValue = (int)re;
                            break Label_0099;
                        }
                    }
                    intValue = 0;
                }
                int n2 = intValue;
                if (intValue == 0) {
                    if (constraintLayout != null) {
                        n2 = this.d(constraintLayout, trim);
                    }
                    else {
                        n2 = 0;
                    }
                }
                if (n2 == 0) {
                    try {
                        n2 = aee.class.getField(trim).getInt(null);
                    }
                    catch (final Exception ex) {
                        n2 = n;
                    }
                }
                int identifier;
                if ((identifier = n2) == 0) {
                    identifier = this.e.getResources().getIdentifier(trim, "id", this.e.getPackageName());
                }
                if (identifier != 0) {
                    this.h.put(identifier, trim);
                    this.i(identifier);
                    return;
                }
                final StringBuilder sb = new StringBuilder("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }
    
    private final void i(final int n) {
        if (n == this.getId()) {
            return;
        }
        final int d = this.d;
        final int[] c = this.c;
        final int length = c.length;
        if (d + 1 > length) {
            this.c = Arrays.copyOf(c, length + length);
        }
        final int[] c2 = this.c;
        final int d2 = this.d;
        c2[d2] = n;
        this.d = d2 + 1;
    }
    
    private final void j(final String s) {
        if (s != null) {
            if (s.length() != 0) {
                if (this.e == null) {
                    return;
                }
                final String trim = s.trim();
                ConstraintLayout constraintLayout;
                if (this.getParent() instanceof ConstraintLayout) {
                    constraintLayout = (ConstraintLayout)this.getParent();
                }
                else {
                    constraintLayout = null;
                }
                if (constraintLayout == null) {
                    Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                    return;
                }
                for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
                    final View child = constraintLayout.getChildAt(i);
                    final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                    if (layoutParams instanceof ads && trim.equals(((ads)layoutParams).ac)) {
                        if (child.getId() == -1) {
                            final StringBuilder sb = new StringBuilder("to use ConstraintTag view ");
                            sb.append(child.getClass().getSimpleName());
                            sb.append(" must have an ID");
                            Log.w("ConstraintHelper", sb.toString());
                        }
                        else {
                            this.i(child.getId());
                        }
                    }
                }
            }
        }
    }
    
    protected void a(final AttributeSet set) {
        throw null;
    }
    
    public void b(final act act, final boolean b) {
    }
    
    public final int d(final ConstraintLayout constraintLayout, final String s) {
        if (s != null) {
            final Resources resources = this.e.getResources();
            if (resources == null) {
                return 0;
            }
            for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = constraintLayout.getChildAt(i);
                if (child.getId() != -1) {
                    String resourceEntryName;
                    try {
                        resourceEntryName = resources.getResourceEntryName(child.getId());
                    }
                    catch (final Resources$NotFoundException ex) {
                        resourceEntryName = null;
                    }
                    if (s.equals(resourceEntryName)) {
                        return child.getId();
                    }
                }
            }
        }
        return 0;
    }
    
    public final void e(final String f) {
        this.f = f;
        if (f == null) {
            return;
        }
        int n = 0;
        this.d = 0;
        while (true) {
            final int index = f.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.c(f.substring(n, index));
            n = index + 1;
        }
        this.c(f.substring(n));
    }
    
    protected final void f(final String g) {
        this.g = g;
        if (g == null) {
            return;
        }
        int n = 0;
        this.d = 0;
        while (true) {
            final int index = g.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.j(g.substring(n, index));
            n = index + 1;
        }
        this.j(g.substring(n));
    }
    
    public final void g(final int[] array) {
        this.f = null;
        int i = 0;
        this.d = 0;
        while (i < array.length) {
            this.i(array[i]);
            ++i;
        }
    }
    
    public final void h() {
        if (this.i == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof ads) {
            ((ads)layoutParams).av = this.i;
        }
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final String f = this.f;
        if (f != null) {
            this.e(f);
        }
        final String g = this.g;
        if (g != null) {
            this.f(g);
        }
    }
    
    public final void onDraw(final Canvas canvas) {
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public final void setTag(final int n, final Object o) {
        super.setTag(n, o);
        if (o == null && this.f == null) {
            this.i(n);
        }
    }
}
