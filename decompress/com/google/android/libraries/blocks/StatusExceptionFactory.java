// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks;

import com.google.protobuf.ExtensionRegistryLite;

public class StatusExceptionFactory
{
    private StatusExceptionFactory() {
    }
    
    public static StatusException a(final agsr agsr) {
        agsq a;
        if ((agsr.b & 0x8) != 0x0) {
            a = agsq.a(agsr.e);
        }
        else {
            a = null;
        }
        agsq c = a;
        if (a == null) {
            c = agsq.c;
        }
        String d;
        if (agsr.d.isEmpty()) {
            d = "unknown error";
        }
        else {
            d = agsr.d;
        }
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        ahfr ahfr;
        if ((ahfr = agsr.f) == null) {
            ahfr = ahfr.a;
        }
        if (((agzd)ahfr).rs((agyr)aums.b)) {
            final aums aums = (aums)((agzd)ahfr).rr((agyr)aums.b);
            if (aums.c.size() > 0) {
                return new StatusException(c, d, stackTrace, aums);
            }
        }
        return new StatusException(c, d, stackTrace);
    }
    
    public static StatusException fromProto(final byte[] array) {
        try {
            return a((agsr)agzi.parseFrom((agzi)agsr.a, array, ExtensionRegistryLite.getGeneratedRegistry()));
        }
        catch (final ahab ahab) {
            return new StatusException(agsq.o, "Proto parse failed:".concat(String.valueOf(ahab.getMessage())));
        }
    }
    
    public static byte[] toProto(final Throwable t) {
        final agza builder = ((agzi)agsr.a).createBuilder();
        final int s = agsq.o.s;
        builder.copyOnWrite();
        final agsr agsr = (agsr)builder.instance;
        agsr.b |= 0x1;
        agsr.c = s;
        final int s2 = agsq.o.s;
        builder.copyOnWrite();
        final agsr agsr2 = (agsr)builder.instance;
        agsr2.b |= 0x8;
        agsr2.e = s2;
        builder.copyOnWrite();
        agsr.a((agsr)builder.instance);
        if (t.getMessage() != null) {
            final String message = t.getMessage();
            builder.copyOnWrite();
            final agsr agsr3 = (agsr)builder.instance;
            message.getClass();
            agsr3.b |= 0x4;
            agsr3.d = message;
        }
        else {
            builder.copyOnWrite();
            final agsr agsr4 = (agsr)builder.instance;
            agsr4.b |= 0x4;
            agsr4.d = "[message unknown]";
        }
        return ((agxl)builder.build()).toByteArray();
    }
}
