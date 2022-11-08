import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anim extends agzi implements ahax
{
    public static final anim a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        agzi.registerDefaultInstance(anim.class, a = new anim());
        b = agzi.newSingularGeneratedExtension((MessageLite)anip.a, "", null, null, 125983101, ahcm.i, String.class);
    }
    
    private anim() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = anim.c) == null) {
                    synchronized (anim.class) {
                        if (anim.c == null) {
                            anim.c = (ahbe)new agzb((agzi)anim.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return anim.a;
            }
            case 4: {
                return new agza((agzi)anim.a);
            }
            case 3: {
                return new anim();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anim.a, "\u0001\u0000", null);
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
