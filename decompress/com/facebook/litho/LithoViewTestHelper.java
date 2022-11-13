// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.litho;

import android.view.View;
import android.view.ViewParent;
import java.util.Deque;
import java.util.Iterator;
import android.graphics.Rect;
import android.text.TextUtils;

public class LithoViewTestHelper
{
    public static String a(final dvu dvu) {
        if (dvu == null) {
            return "";
        }
        final String viewToString = viewToString(dvu, true);
        if (TextUtils.isEmpty((CharSequence)viewToString)) {
            final StringBuilder sb = new StringBuilder("(");
            sb.append(dvu.getLeft());
            sb.append(",");
            sb.append(dvu.getTop());
            sb.append("-");
            sb.append(dvu.getRight());
            sb.append(",");
            sb.append(dvu.getBottom());
            sb.append(")");
            return sb.toString();
        }
        return viewToString;
    }
    
    private static void b(final dtp dtp, final StringBuilder sb, final boolean b, final boolean b2, final int n, final int n2, final int n3, final dtq dtq) {
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
        dtr.addViewDescription(dtp, sb, n2, n3, b, b2, dtq);
        sb.append("\n");
        final Rect a = dtp.a();
        final Iterator iterator = dtp.k().iterator();
        while (iterator.hasNext()) {
            b((dtp)iterator.next(), sb, b, b2, n + 1, a.left, a.top, dtq);
        }
    }
    
    public static TestItem findTestItem(final dvu dvu, final String s) {
        final Deque testItems = dvu.findTestItems(s);
        if (testItems.isEmpty()) {
            return null;
        }
        return (TestItem)testItems.getLast();
    }
    
    public static Deque findTestItems(final dvu dvu, final String s) {
        return dvu.findTestItems(s);
    }
    
    public static String viewToString(final dvu dvu) {
        return viewToString(dvu, false).trim();
    }
    
    public static String viewToString(final dvu dvu, final boolean b) {
        final dtp e = dtp.e(dvu);
        if (e == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        int n;
        if (b) {
            ViewParent viewParent = dvu.getParent();
            n = 3;
            while (viewParent != null) {
                ++n;
                viewParent = viewParent.getParent();
            }
        }
        else {
            n = 0;
        }
        sb.append("\n");
        b(e, sb, b, false, n, 0, 0, null);
        return sb.toString();
    }
    
    public static String viewToStringForE2E(final View view, final int n, final boolean b) {
        return viewToStringForE2E(view, n, b, null);
    }
    
    public static String viewToStringForE2E(final View view, final int n, final boolean b, final dtq dtq) {
        if (!(view instanceof dvu)) {
            return "";
        }
        final dtp e = dtp.e((dvu)view);
        if (e == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        b(e, sb, true, b, n, 0, 0, dtq);
        return sb.toString();
    }
}
