import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicd extends agzi implements ahax
{
    private static final aicd a;
    private static volatile ahbe b;
    private int c;
    private Object d;
    
    static {
        agzi.registerDefaultInstance((Class)aicd.class, (agzi)(a = new aicd()));
    }
    
    private aicd() {
        this.c = 0;
    }
    
    public static aicb a() {
        return (aicb)aicd.a.createBuilder();
    }
    
    public static aicd d() {
        return aicd.a;
    }
    
    private void h(final aice d) {
        d.getClass();
        this.d = d;
        this.c = 2;
    }
    
    private void i(final aicg d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    public aicc b() {
        return aicc.a(this.c);
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aicd.b) == null) {
                    synchronized (aicd.class) {
                        if (aicd.b == null) {
                            aicd.b = (ahbe)new agzb((agzi)aicd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aicd.a;
            }
            case 4: {
                return new aicb();
            }
            case 3: {
                return new aicd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicd.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "d", "c", aicg.class, aice.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aicg e() {
        if (this.c == 1) {
            return (aicg)this.d;
        }
        return aicg.c();
    }
}
