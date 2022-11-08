// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

import java.io.Serializable;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;

public final class Status
{
    public static final Status OK;
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final arub m;
    public static final arub n;
    private static final aruf p;
    public final Throwable o;
    private final Status$Code q;
    private final String r;
    
    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        final TreeMap treeMap = new TreeMap();
        for (final Status$Code status$Code : Status$Code.values()) {
            final Status status = treeMap.put(status$Code.value(), new Status(status$Code, null, null));
            if (status != null) {
                final String name = status.getCode().name();
                final String name2 = status$Code.name();
                final StringBuilder sb = new StringBuilder("Code value duplication between ");
                sb.append(name);
                sb.append(" & ");
                sb.append(name2);
                throw new IllegalStateException(sb.toString());
            }
        }
        a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(treeMap.values()));
        OK = Status$Code.a.b();
        b = Status$Code.b.b();
        c = Status$Code.c.b();
        d = Status$Code.d.b();
        e = Status$Code.e.b();
        Status$Code.f.b();
        Status$Code.g.b();
        f = Status$Code.h.b();
        g = Status$Code.q.b();
        h = Status$Code.i.b();
        Status$Code.j.b();
        i = Status$Code.k.b();
        Status$Code.l.b();
        j = Status$Code.m.b();
        k = Status$Code.n.b();
        l = Status$Code.o.b();
        Status$Code.p.b();
        m = arub.f("grpc-status", false, (aruf)new arvj());
        n = arub.f("grpc-message", false, p = (aruf)new arvk());
    }
    
    private Status(final Status$Code q, final String r, final Throwable o) {
        q.getClass();
        this.q = q;
        this.r = r;
        this.o = o;
    }
    
    public static Status b(final Throwable t) {
        t.getClass();
        for (Throwable cause = t; cause != null; cause = cause.getCause()) {
            if (cause instanceof StatusException) {
                return ((StatusException)cause).a;
            }
            if (cause instanceof arvl) {
                return ((arvl)cause).a;
            }
        }
        return Status.c.c(t);
    }
    
    public static String e(final Status status) {
        if (status.r == null) {
            return status.q.toString();
        }
        final String string = status.q.toString();
        final String r = status.r;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(": ");
        sb.append(r);
        return sb.toString();
    }
    
    public static Status fromCodeValue(final int n) {
        if (n >= 0) {
            final List a = Status.a;
            if (n <= a.size()) {
                return (Status)a.get(n);
            }
        }
        final Status c = Status.c;
        final StringBuilder sb = new StringBuilder("Unknown code ");
        sb.append(n);
        return c.withDescription(sb.toString());
    }
    
    public final Status a(final String s) {
        final String r = this.r;
        if (r == null) {
            return new Status(this.q, s, this.o);
        }
        final Status$Code q = this.q;
        final StringBuilder sb = new StringBuilder();
        sb.append(r);
        sb.append("\n");
        sb.append(s);
        return new Status(q, sb.toString(), this.o);
    }
    
    public StatusException asException() {
        return new StatusException(this);
    }
    
    public final Status c(final Throwable t) {
        if (aeda.v(this.o, t)) {
            return this;
        }
        return new Status(this.q, this.r, t);
    }
    
    public final arvl d() {
        return new arvl(this);
    }
    
    public final boolean f() {
        return Status$Code.a == this.q;
    }
    
    public final arvl g() {
        return new arvl(this);
    }
    
    public Status$Code getCode() {
        return this.q;
    }
    
    public String getDescription() {
        return this.r;
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("code", (Object)this.q.name());
        o.b("description", (Object)this.r);
        Serializable s;
        final Throwable t = (Throwable)(s = this.o);
        if (t != null) {
            s = aeyv.a(t);
        }
        o.b("cause", (Object)s);
        return o.toString();
    }
    
    public Status withDescription(final String s) {
        if (aeda.v(this.r, s)) {
            return this;
        }
        return new Status(this.q, s, this.o);
    }
}
