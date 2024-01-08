package ru.gor.library.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class CommentTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static Comment getCommentSample1() {
        return new Comment().id(1L).nickName("nickName1").commentText("commentText1");
    }

    public static Comment getCommentSample2() {
        return new Comment().id(2L).nickName("nickName2").commentText("commentText2");
    }

    public static Comment getCommentRandomSampleGenerator() {
        return new Comment()
            .id(longCount.incrementAndGet())
            .nickName(UUID.randomUUID().toString())
            .commentText(UUID.randomUUID().toString());
    }
}
