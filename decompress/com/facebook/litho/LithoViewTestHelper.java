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
    public static String a(final dvx dvx) {
        if (dvx == null) {
            return "";
        }
        final String viewToString = viewToString(dvx, true);
        if (TextUtils.isEmpty((CharSequence)viewToString)) {
            final StringBuilder sb = new StringBuilder("(");
            sb.append(dvx.getLeft());
            sb.append(",");
            sb.append(dvx.getTop());
            sb.append("-");
            sb.append(dvx.getRight());
            sb.append(",");
            sb.append(dvx.getBottom());
            sb.append(")");
            return sb.toString();
        }
        return viewToString;
    }
    
    private static void b(final dts dts, final StringBuilder sb, final boolean b, final boolean b2, final int n, final int n2, final int n3, final dtt dtt) {
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
        dtu.addViewDescription(dts, sb, n2, n3, b, b2, dtt);
        sb.append("\n");
        final Rect a = dts.a();
        final Iterator iterator = dts.k().iterator();
        while (iterator.hasNext()) {
            b((dts)iterator.next(), sb, b, b2, n + 1, a.left, a.top, dtt);
        }
    }
    
    public static TestItem findTestItem(final dvx dvx, final String s) {
        final Deque testItems = dvx.findTestItems(s);
        if (testItems.isEmpty()) {
            return null;
        }
        return (TestItem)testItems.getLast();
    }
    
    public static Deque findTestItems(final dvx dvx, final String s) {
        return dvx.findTestItems(s);
    }
    
    public static String viewToString(final dvx dvx) {
        return viewToString(dvx, false).trim();
    }
    
    public static String viewToString(final dvx dvx, final boolean b) {
        final dts e = dts.e(dvx);
        if (e == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        int n;
        if (b) {
            ViewParent viewParent = dvx.getParent();
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
    
    public static String viewToStringForE2E(final View view, final int n, final boolean b, final dtt dtt) {
        if (!(view instanceof dvx)) {
            return "";
        }
        final dts e = dts.e((dvx)view);
        if (e == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        b(e, sb, true, b, n, 0, 0, dtt);
        return sb.toString();
    }
}
