import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijj extends agzi implements ahax
{
    public static final aijj a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public aioe d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aijj.class, a = new aijj());
    }
    
    private aijj() {
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
                final ahbe e;
                if ((e = aijj.e) == null) {
                    synchronized (aijj.class) {
                        if (aijj.e == null) {
                            aijj.e = (ahbe)new agzb((agzi)aijj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aijj.a;
            }
            case 4: {
                return new agza((agzi)aijj.a);
            }
            case 3: {
                return new aijj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1007\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
