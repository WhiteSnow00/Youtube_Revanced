import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aout extends agzi implements ahax
{
    public static final aout a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public agzy d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aout.class, a = new aout());
    }
    
    private aout() {
        this.f = 2;
        this.c = "";
        this.d = agzi.emptyProtobufList();
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
                if ((e = aout.e) == null) {
                    synchronized (aout.class) {
                        if (aout.e == null) {
                            aout.e = (ahbe)new agzb((agzi)aout.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aout.a;
            }
            case 4: {
                return new agza((agzi)aout.a);
            }
            case 3: {
                return new aout();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aout.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "b", "c", "d", aous.class });
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
