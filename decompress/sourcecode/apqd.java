import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqd extends agzi implements ahax
{
    public static final apqd a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apqd.class, (agzi)(a = new apqd()));
    }
    
    private apqd() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apqd.c) == null) {
                    synchronized (apqd.class) {
                        if (apqd.c == null) {
                            apqd.c = (ahbe)new agzb((agzi)apqd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apqd.a;
            }
            case 4: {
                return new agza((agzi)apqd.a);
            }
            case 3: {
                return new apqd();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aipt.m });
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
