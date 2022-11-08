import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjs extends agzi implements ahax
{
    private static final apjs a;
    private static volatile ahbe b;
    private int c;
    private Object d;
    
    static {
        agzi.registerDefaultInstance(apjs.class, a = new apjs());
    }
    
    private apjs() {
        this.c = 0;
    }
    
    public static apjr a() {
        return (apjr)apjs.a.createBuilder();
    }
    
    private void d(final apjq d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apjs.b) == null) {
                    synchronized (apjs.class) {
                        if (apjs.b == null) {
                            apjs.b = (ahbe)new agzb((agzi)apjs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apjs.a;
            }
            case 4: {
                return new apjr();
            }
            case 3: {
                return new apjs();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjs.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "d", "c", apjq.class });
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
