import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apni extends agzi implements ahax
{
    public static final apni a;
    private static volatile ahbe i;
    public int b;
    public agyc c;
    public int d;
    public int e;
    public int f;
    public apni g;
    public aild h;
    
    static {
        agzi.registerDefaultInstance((Class)apni.class, (agzi)(a = new apni()));
    }
    
    private apni() {
        this.c = agyc.b;
        this.e = -1;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = apni.i) == null) {
                    synchronized (apni.class) {
                        if (apni.i == null) {
                            apni.i = (ahbe)new agzb((agzi)apni.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apni.a;
            }
            case 4: {
                return new agza((agzi)apni.a);
            }
            case 3: {
                return new apni();
            }
            case 2: {
                return newMessageInfo((MessageLite)apni.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0006\u1004\u0003\u0007\u1009\u0004\b\u1009\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
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
