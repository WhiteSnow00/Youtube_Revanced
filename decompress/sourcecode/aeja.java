import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeja extends agzi implements ahax
{
    public static final aeja a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public ahas d;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aeja.class, a = new aeja());
    }
    
    private aeja() {
        this.d = ahas.a;
        this.f = 2;
        this.c = 1;
    }
    
    public final ahas a() {
        final ahas d = this.d;
        if (!d.b) {
            this.d = d.a();
        }
        return this.d;
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
                if ((e = aeja.e) == null) {
                    synchronized (aeja.class) {
                        if (aeja.e == null) {
                            aeja.e = (ahbe)new agzb((agzi)aeja.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aeja.a;
            }
            case 4: {
                return new agza((agzi)aeja.a);
            }
            case 3: {
                return new aeja();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aeja.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001\u1004\u0000\u0002\u0432", new Object[] { "b", "c", "d", aeiz.a });
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
