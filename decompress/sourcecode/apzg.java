import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzg extends agzi implements ahax
{
    public static final apzg a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public aqsz d;
    
    static {
        agzi.registerDefaultInstance(apzg.class, a = new apzg());
    }
    
    private apzg() {
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
                if ((e = apzg.e) == null) {
                    synchronized (apzg.class) {
                        if (apzg.e == null) {
                            apzg.e = (ahbe)new agzb((agzi)apzg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apzg.a;
            }
            case 4: {
                return new agza((agzi)apzg.a);
            }
            case 3: {
                return new apzg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", apsc.u, "d" });
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
