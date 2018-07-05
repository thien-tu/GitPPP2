package com.example.lam.gitppp;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by lam on 7/5/2018.
 */

public class ReactionView extends View {

    enum StateDraw{
        BEGIN,
        CHOOSING,
        END
    }

    public static final long DURATION_ANIMATION = 200;

    public static final long DURATION_BEGINNING_EACH_ITEM = 300;

    public static final long DURATION_BEGINNING_ANIMATION = 900;

    private Board board;

    private StateDraw stateDraw = StateDraw.BEGIN;

    private int currentPosition = 0;

    public ReactionView(Context context) {
        super(context);
        init();
    }

    public ReactionView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        init();
    }

    public ReactionView(Context context, AttributeSet attributeSet,int defStyleAttr){
        super(context, attributeSet, defStyleAttr);
        init();
    }

    private void init(){

    }

    private void initElement(){

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    private void beforeAnimateBeginning(){

    }

    private void beforeAnimateChoosing(){

    }

    private void beforeAnimateNormalBack(){

    }

    private void calculateInSessionChoosingAndEnding(float interpolatedTime){

    }

    private void calculateInSessionBeginning(float interpolatedTime){

    }

    private int calculateSize(int position,float interpolatedTime){
        return 0;
    }

    private void calculateCoordinateX(){

    }

    public void show(){

    }

    private void selected(int position){}

    public void backNormal(){

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    class ChooseEmotionAnimation extends Animation{

        public ChooseEmotionAnimation(){}

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {

        }

    }

    class BeginningAnimation extends Animation{

        public BeginningAnimation(){}

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {

        }
    }
}
