import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqg extends agzi implements ahax
{
    public static final alqg a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(alqg.class, a = new alqg());
    }
    
    private alqg() {
        this.c = agzi.emptyProtobufList();
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
                if ((e = alqg.e) == null) {
                    synchronized (alqg.class) {
                        if (alqg.e == null) {
                            alqg.e = (ahbe)new agzb((agzi)alqg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alqg.a;
            }
            case 4: {
                return new agza((short[])null);
            }
            case 3: {
                return new alqg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000", new Object[] { "b", "c", alqh.class, "d" });
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
