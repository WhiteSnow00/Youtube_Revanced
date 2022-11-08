import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aocw extends agzi implements ahax
{
    public static final aocw a;
    public static final agzg b;
    private static volatile ahbe c;
    private int d;
    private anss e;
    private byte f;
    
    static {
        final aocw a2 = new aocw();
        agzi.registerDefaultInstance(aocw.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 376981509, ahcm.k, aocw.class);
    }
    
    private aocw() {
        this.f = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aocw.c) == null) {
                    synchronized (aocw.class) {
                        if (aocw.c == null) {
                            aocw.c = (ahbe)new agzb((agzi)aocw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aocw.a;
            }
            case 4: {
                return new agza((agzi)aocw.a);
            }
            case 3: {
                return new aocw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aocw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
