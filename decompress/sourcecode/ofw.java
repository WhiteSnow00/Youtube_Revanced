import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofw extends agzi implements ahax
{
    public static final ofw a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance(ofw.class, a = new ofw());
    }
    
    private ofw() {
        this.b = ahas.a;
    }
    
    public final ahas a() {
        final ahas b = this.b;
        if (!b.b) {
            this.b = b.a();
        }
        return this.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ofw.c) == null) {
                    synchronized (ofw.class) {
                        if (ofw.c == null) {
                            ofw.c = (ahbe)new agzb((agzi)ofw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ofw.a;
            }
            case 4: {
                return new agza((agzi)ofw.a);
            }
            case 3: {
                return new ofw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ofw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ofv.a });
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
