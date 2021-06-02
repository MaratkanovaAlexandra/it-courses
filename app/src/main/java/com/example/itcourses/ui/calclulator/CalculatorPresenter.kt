package com.example.itcourses.ui.calclulator

import android.widget.Toast
import com.example.itcourses.calculator.*
import com.example.itcourses.ui.base.BasePresenter

class CalculatorPresenter(view: CalculatorView) : BasePresenter<CalculatorView>(view){

    //val calc: CalculatorImpl
    private var _input = "";

    fun onClearClick() {
        if (_input == "") return;
        _input = _input.substring(0, _input.length - 1);
        view.showInputText(_input);
        view.showAnswerText("");
    }

    fun onEquallyClick(){
        if (_input.contains("+")) {
            var items = _input.split("+").toTypedArray();

            val result = items[0].toDouble() + items[1].toDouble();
            if((result%1).toString() == "0.0") {
                view.showAnswerText(result.toInt().toString());
            } else {
                view.showAnswerText(result.toString());
            }
        }
        if (_input.contains("-")) {
            var items = _input.split("-").toTypedArray();
            val result = items[0].toDouble() - items[1].toDouble();
            if((result%1).toString() == "0.0") {
                view.showAnswerText(result.toInt().toString());
            } else {
                view.showAnswerText(result.toString());
            }
        }
        if (_input.contains("*")) {
            var items = _input.split("*").toTypedArray();
            val result = items[0].toDouble() * items[1].toDouble();
            if((result%1).toString() == "0.0") {
                view.showAnswerText(result.toInt().toString());
            } else {
                view.showAnswerText(result.toString());
            }
        }
        if (_input.contains("/")) {
            var items = _input.split("/").toTypedArray();
            val result = items[0].toDouble() / items[1].toDouble();
            if((result%1).toString() == "0.0") {
                view.showAnswerText(result.toInt().toString());
            } else {
                view.showAnswerText(result.toString());
            }
        }

    }

    fun onSubClick() {
        _input += "-";
        view.showInputText(_input);
    }

    fun onSumClick() {
        _input += "+";
        view.showInputText(_input);
    }

    fun onDivClick() {
        _input += "/";
        view.showInputText(_input);
    }

    fun onMultClick() {
        _input += "*";
        view.showInputText(_input);
    }

    fun onNum1Click() {
        _input += "1";
        view.showInputText(_input);
    }

    fun onNum2Click() {
        _input += "2";
        view.showInputText(_input);
    }
    fun onNum3Click() {
        _input += "3";
        view.showInputText(_input);
    }
    fun onNum4Click(){
        _input += "4";
        view.showInputText(_input);
    }
    fun onNum5Click(){
        _input += "5";
        view.showInputText(_input);
    }
    fun onNum6Click(){
        _input += "6";
        view.showInputText(_input);
    }
    fun onNum7Click() {
        _input += "7";
        view.showInputText(_input);
    }
    fun onNum8Click(){
        _input += "8";
        view.showInputText(_input);
    }
    fun onNum9Click(){
        _input += "9";
        view.showInputText(_input);
    }
    fun onNum0Click(){
        _input += "0";
        view.showInputText(_input);
    }

    fun onDotClick(){
        _input += ".";
        view.showInputText(_input);
    }
}
