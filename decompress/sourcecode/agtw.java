import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtw extends agzi implements ahax
{
    private static final agtw a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance(agtw.class, a = new agtw());
    }
    
    private agtw() {
    }
    
    public static agtu a() {
        return (agtu)agtw.a.createBuilder();
    }
    
    private void d(final agtv agtv) {
        this.d = agtv.i;
        this.c |= 0x1;
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
                if ((b = agtw.b) == null) {
                    synchronized (agtw.class) {
                        if (agtw.b == null) {
                            agtw.b = (ahbe)new agzb((agzi)agtw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agtw.a;
            }
            case 4: {
                return new agtu();
            }
            case 3: {
                return new agtw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agtw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", agtv.b() });
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