import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoj extends agzi implements ahax
{
    public static final akoj a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public int d;
    public akvb e;
    public String f;
    public boolean g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(akoj.class, a = new akoj());
    }
    
    private akoj() {
        this.i = 2;
        this.f = "";
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
                final ahbe h;
                if ((h = akoj.h) == null) {
                    synchronized (akoj.class) {
                        if (akoj.h == null) {
                            akoj.h = (ahbe)new agzb((agzi)akoj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akoj.a;
            }
            case 4: {
                return new agza((agzi)akoj.a);
            }
            case 3: {
                return new akoj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akoj.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1008\u0003\u0004\u1007\u0004\u0005\u100c\u0001", new Object[] { "b", "c", "e", "f", "g", "d", anoo.u });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
