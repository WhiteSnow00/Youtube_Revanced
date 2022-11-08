import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobj extends agzi implements ahax
{
    public static final aobj a;
    private static volatile ahbe b;
    private int c;
    private aiaa d;
    private akbb e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aobj.class, a = new aobj());
    }
    
    private aobj() {
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
                final ahbe b2;
                if ((b2 = aobj.b) == null) {
                    synchronized (aobj.class) {
                        if (aobj.b == null) {
                            aobj.b = (ahbe)new agzb((agzi)aobj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aobj.a;
            }
            case 4: {
                return new agza((agzi)aobj.a);
            }
            case 3: {
                return new aobj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobj.a, "\u0001\u0002\u0000\u0001\uf2a1\u264b\ue264\u2a5d\u0002\u0000\u0000\u0002\uf2a1\u264b\u1409\u0000\ue264\u2a5d\u1409\u0001", new Object[] { "c", "d", "e" });
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
