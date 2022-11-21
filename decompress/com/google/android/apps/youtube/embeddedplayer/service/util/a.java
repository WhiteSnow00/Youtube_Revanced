// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.util;

import j$.time.Duration;
import java.util.Arrays;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Optional;

public final class a
{
    private static final afgh a;
    private static final afgh b;
    
    static {
        a = afgh.u("youtube.com", "www.youtube.com", "m.youtube.com", "youtu.be");
        b = afgh.s("start", "t");
    }
    
    public static Optional a(String s) {
        Optional optional;
        if (TextUtils.isEmpty((CharSequence)s)) {
            optional = Optional.empty();
        }
        else {
            Uri uri;
            if (!(uri = Uri.parse(s)).isAbsolute()) {
                uri = Uri.fromParts("https", s, (String)null);
            }
            s = uri.getHost();
            if (s != null && com.google.android.apps.youtube.embeddedplayer.service.util.a.a.contains(aewr.b(s))) {
                final List pathSegments = uri.getPathSegments();
                if (pathSegments != null && pathSegments.size() > 0 && pathSegments.size() <= 2) {
                    optional = Optional.of((Object)uri);
                }
                else {
                    optional = Optional.empty();
                }
            }
            else {
                optional = Optional.empty();
            }
        }
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        final Uri uri2 = (Uri)optional.get();
        if ("youtu.be".equals(uri2.getHost())) {
            final List pathSegments2 = uri2.getPathSegments();
            Optional optional2;
            if (pathSegments2.size() != 1) {
                optional2 = Optional.empty();
            }
            else {
                optional2 = SimplePlaybackDescriptor.f(pathSegments2.get(0), null, null, b(uri2), 0, e(uri2));
            }
            return optional2;
        }
        Optional optional3;
        if (!"embed".equals(uri2.getPathSegments().get(0))) {
            optional3 = Optional.empty();
        }
        else {
            s = uri2.getQueryParameter("playlist");
            List<String> list;
            if (s != null) {
                list = Arrays.asList(s.split(","));
            }
            else {
                list = null;
            }
            optional3 = SimplePlaybackDescriptor.f((String)f(uri2).orElse((Object)null), list, uri2.getQueryParameter("list"), b(uri2), d(uri2), e(uri2));
        }
        if (optional3.isEmpty()) {
            final List pathSegments3 = uri2.getPathSegments();
            Optional optional4;
            if (pathSegments3.size() <= 0) {
                optional4 = Optional.empty();
            }
            else if (!"watch".equals(pathSegments3.get(0))) {
                optional4 = Optional.empty();
            }
            else {
                optional4 = SimplePlaybackDescriptor.f((String)f(uri2).orElse((Object)null), null, uri2.getQueryParameter("list"), b(uri2), d(uri2), e(uri2));
            }
            return optional4;
        }
        return optional3;
    }
    
    private static int b(final Uri uri) {
        if (c(uri, "autoplay") != 1) {
            return 0;
        }
        return 1;
    }
    
    private static int c(final Uri uri, final String s) {
        final String queryParameter = uri.getQueryParameter(s);
        if (TextUtils.isEmpty((CharSequence)queryParameter)) {
            return 0;
        }
        try {
            return Integer.parseInt(queryParameter);
        }
        catch (final Exception ex) {
            return 0;
        }
    }
    
    private static int d(final Uri uri) {
        return c(uri, "index");
    }
    
    private static int e(final Uri uri) {
        final int c = c(uri, "tms");
        if (c != 0) {
            return c;
        }
        final afgh b = com.google.android.apps.youtube.embeddedplayer.service.util.a.b;
        final int c2 = ((afjx)b).c;
        int n = 0;
        int i;
        do {
            final int n2 = c;
            if (n >= c2) {
                return n2;
            }
            i = c(uri, b.get(n));
            ++n;
        } while (i == 0);
        return (int)Duration.ofSeconds((long)i).toMillis();
    }
    
    private static Optional f(final Uri uri) {
        final List pathSegments = uri.getPathSegments();
        String s;
        if (pathSegments.size() >= 2) {
            s = pathSegments.get(1);
        }
        else {
            s = null;
        }
        String queryParameter = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            queryParameter = uri.getQueryParameter("v");
        }
        return Optional.ofNullable((Object)queryParameter);
    }
}
