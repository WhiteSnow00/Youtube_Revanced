import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjf extends agzi implements ahax
{
    public static final anjf a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public boolean e;
    
    static {
        final anjf a2 = new anjf();
        agzi.registerDefaultInstance(anjf.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 290, ahcm.k, anjf.class);
    }
    
    private anjf() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = anjf.f) == null) {
                    synchronized (anjf.class) {
                        if (anjf.f == null) {
                            anjf.f = (ahbe)new agzb((agzi)anjf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anjf.a;
            }
            case 4: {
                return new agza((agzi)anjf.a);
            }
            case 3: {
                return new anjf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "c", "d", "e" });
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
