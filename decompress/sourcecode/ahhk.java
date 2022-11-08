import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhk extends agzi implements ahax
{
    private static final ahhk a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    static {
        agzi.registerDefaultInstance(ahhk.class, a = new ahhk());
    }
    
    private ahhk() {
    }
    
    public static ahhj a() {
        return (ahhj)ahhk.a.createBuilder();
    }
    
    private void f(final ahhg ahhg) {
        this.e = ahhg.d;
        this.c |= 0x2;
    }
    
    private void g(final ahhh ahhh) {
        this.f = ahhh.d;
        this.c |= 0x4;
    }
    
    private void h(final ahhi ahhi) {
        this.d = ahhi.c;
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
                if ((b = ahhk.b) == null) {
                    synchronized (ahhk.class) {
                        if (ahhk.b == null) {
                            ahhk.b = (ahbe)new agzb((agzi)ahhk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahhk.a;
            }
            case 4: {
                return new ahhj();
            }
            case 3: {
                return new ahhk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "c", "d", ahhi.a(), "e", ahhg.a(), "f", ahhh.a() });
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
