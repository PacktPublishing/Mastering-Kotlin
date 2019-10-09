//
//  ViewController.swift
//  iosapp
//
//  Created by Nate Ebel on 8/22/19.
//  Copyright © 2019 packt. All rights reserved.
//

import UIKit
import core

class ViewController: UIViewController {
    
    let presenter = Presenter()

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let title = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        title.center = CGPoint(x: 160, y: 285)
        title.textAlignment = .center
        title.font = title.font.withSize(25)
        view.addSubview(title)
        
        let subtitle = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        subtitle.center = CGPoint(x: 160, y: 385)
        subtitle.textAlignment = .center
        subtitle.font = subtitle.font.withSize(25)
        view.addSubview(subtitle)
        
        let button = UIButton(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        button.center = CGPoint(x: 160, y: 485)
        button.setTitle("Click Me", for: .normal)
        button.backgroundColor = UIColor(red: 0, green: 50/255, blue: 51/255, alpha: 0.5)
        view.addSubview(button)
        
        presenter.viewStateListener = {
            title.text = $0.title
            subtitle.text = $0.subtitle
            return KotlinUnit()
        }
        
        button.addTarget(self, action: #selector(buttonClicked), for: .touchUpInside)
    }
    
    @objc func buttonClicked() {
        presenter.onClick()
    }
}

