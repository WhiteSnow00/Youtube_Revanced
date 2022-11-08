import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrg extends agzi implements ahax
{
    public static final alrg a;
    private static volatile ahbe e;
    public int b;
    public alqy c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(alrg.class, a = new alrg());
    }
    
    private alrg() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = alrg.e) == null) {
                    synchronized (alrg.class) {
                        if (alrg.e == null) {
                            alrg.e = (ahbe)new agzb((agzi)alrg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alrg.a;
            }
            case 4: {
                return new alrf();
            }
            case 3: {
                return new alrg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", alll.s });
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
