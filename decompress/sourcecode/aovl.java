import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovl extends agzi implements ahax
{
    private static final aovl a;
    private static volatile ahbe b;
    private int c;
    private Object d;
    
    static {
        agzi.registerDefaultInstance(aovl.class, a = new aovl());
    }
    
    private aovl() {
        this.c = 0;
    }
    
    public static /* synthetic */ aovl c() {
        return aovl.a;
    }
    
    public static aovl d() {
        return aovl.a;
    }
    
    public anuh a() {
        if (this.c == 2) {
            return (anuh)this.d;
        }
        return anuh.a;
    }
    
    public aovk b() {
        return aovk.a(this.c);
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
                if ((b = aovl.b) == null) {
                    synchronized (aovl.class) {
                        if (aovl.b == null) {
                            aovl.b = (ahbe)new agzb((agzi)aovl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aovl.a;
            }
            case 4: {
                return new agza((agzi)c());
            }
            case 3: {
                return new aovl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aovl.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "d", "c", aovj.class, anuh.class });
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
