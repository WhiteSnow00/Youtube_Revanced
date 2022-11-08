import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvl extends agzi implements ahax
{
    public static final amvl a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public amvj d;
    public amvm e;
    public aizz f;
    public amvi g;
    private int i;
    
    static {
        agzi.registerDefaultInstance(amvl.class, a = new amvl());
    }
    
    private amvl() {
        this.c = "";
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = amvl.h) == null) {
                    synchronized (amvl.class) {
                        if (amvl.h == null) {
                            amvl.h = (ahbe)new agzb((agzi)amvl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amvl.a;
            }
            case 4: {
                return new agza((agzi)amvl.a);
            }
            case 3: {
                return new amvl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvl.a, "\u0001\u0005\u0000\u0002\u00012\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0014\u1009\u0011\u001b\u1009\u00172\u1009)", new Object[] { "b", "i", "c", "d", "e", "f", "g" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
