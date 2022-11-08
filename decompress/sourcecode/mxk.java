// 
// Decompiled by Procyon v0.6.0
// 

public final class mxk
{
    public static final ehs a;
    
    static {
        final agza builder = ((agzi)ehs.a).createBuilder();
        builder.copyOnWrite();
        final ehs ehs = (ehs)builder.instance;
        ehs.b |= 0x400000;
        ehs.s = "E";
        a = (ehs)builder.build();
    }
}
